package unq.tpi.persistencia.alumnos.dao.locator;

import unq.tpi.persistencia.alumnos.dao.AlumnoDAO;
import unq.tpi.persistencia.alumnos.dao.CursoDAO;
import unq.tpi.persistencia.alumnos.dao.MateriaDAO;
import unq.tpi.persistencia.alumnos.dao.hibernate.AlumnoDAOHibernate;
import unq.tpi.persistencia.alumnos.dao.hibernate.CursoDAOHibernate;
import unq.tpi.persistencia.alumnos.dao.hibernate.MateriaDAOHibernate;

public class HibernateDAOLocator implements DAOLocator {

	@Override
	public AlumnoDAO getAlumnoHome() {
		return new AlumnoDAOHibernate();
	}

	@Override
	public MateriaDAO getMateriaHome() {
		return new MateriaDAOHibernate();
	}

	@Override
	public CursoDAO getCursoHome() {
		return new CursoDAOHibernate();
	}

}
