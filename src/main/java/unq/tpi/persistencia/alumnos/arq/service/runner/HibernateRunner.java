package unq.tpi.persistencia.alumnos.arq.service.runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import unq.tpi.persistencia.alumnos.arq.service.ServiceCommand;
import unq.tpi.persistencia.alumnos.dao.locator.DAOLocator;
import unq.tpi.persistencia.alumnos.dao.locator.HibernateDAOLocator;

/**
 * Executa un ServiceCommand en el contexto de una session / transaccion
 * de hibernate.
 * 
 * Se encarga de liberar los recursos y comitear / rollbackear la transaccion
 * luego de que el commando haya sido ejecutado
 */
public class HibernateRunner implements Runner {
	private static final SessionFactory SESSION_FACTORY = HibernateRunner.initFactory();
	private static final ThreadLocal<Session> CURRENT_SESSION = new ThreadLocal<Session>();

	private DAOLocator daoLocator = new HibernateDAOLocator();
	
	@Override
	public <T> T run(ServiceCommand<T> command) {
		T result = null;

		Session session = null;
		try  {
			// Abro session, abro transaccion y guardo la session para despues
			session = SESSION_FACTORY.openSession();
			session.beginTransaction();
			this.rememberCurrentSession(session);

			// Ejecuta el comando
			result = command.call(this.daoLocator);

			// SI todo fue ok, commitea la transaccion
			session.getTransaction().commit();
			return result;
			
		} catch (RuntimeException e) {
			// Si hubo un error, rollbackea la transaccion
			if (session.getTransaction().isActive()) {
				session.getTransaction().rollback();
			}
			throw e;
		} finally {
			// Cierra la session
			this.forgetCurrentSession();
			this.close(session);
		}
	}

	/**
	 * Cierra la session actual, este metodo no arroja excepciones ya que
	 * está diseñado para ser invocado desde un finally
	 */
	private void close(Session session) {
		try {
			if (session != null) {
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Inicializa la SessionFactory de hibernate
	 */
	private static SessionFactory initFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		return cfg.buildSessionFactory();
	}

	/**
	 * Devuelve la Session que se encuentra actualmente abierta.
	 */
	public static Session currentSession() {
		Session currentSession = CURRENT_SESSION.get();
		if (currentSession == null) {
			throw new RuntimeException("No hay ninguna session abierta en este contexto");
		}
		return currentSession;
	}

	private void rememberCurrentSession(Session session) {
		CURRENT_SESSION.set(session);
	}
	
	private void forgetCurrentSession() {
		CURRENT_SESSION.set(null);
	}
	
}
