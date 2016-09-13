package unq.tpi.persistencia.alumnos.dao.hibernate;

import java.util.List;

import unq.tpi.persistencia.alumnos.arq.dao.BaseHibernateDAO;
import unq.tpi.persistencia.alumnos.dao.CursoDAO;
import unq.tpi.persistencia.alumnos.model.Curso;
import unq.tpi.persistencia.alumnos.model.Materia;

public class CursoDAOHibernate extends BaseHibernateDAO<Curso> implements CursoDAO {
	
	public CursoDAOHibernate() {
		super(Curso.class);
	}

	@Override
	public List<Curso> getCursosMateria(Materia materia) {
		throw new RuntimeException("Implement me :(");
	}

}
