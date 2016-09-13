package unq.tpi.persistencia.alumnos.arq.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;

import unq.tpi.persistencia.alumnos.arq.service.runner.HibernateRunner;

public class BaseHibernateDAO<T> {

	private final Class<T> persistentClass;
	
	public BaseHibernateDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	protected Session session() {
		return HibernateRunner.currentSession();
	}
	
	public void save(T object) {
		this.session().saveOrUpdate(object);
	}
	
	public List<T> getAll() {
		//CriteriaQuery es un builder que ayuda a construir queries, una query tambien podria construirse
		//directamente usando HQL
		CriteriaQuery<T> query = this.session().getCriteriaBuilder().createQuery(this.persistentClass);
		return this.session().createQuery(query).getResultList();
	}
	
}
