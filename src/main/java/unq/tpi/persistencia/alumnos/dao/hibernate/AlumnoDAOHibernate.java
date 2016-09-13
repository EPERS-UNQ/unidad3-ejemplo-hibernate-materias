package unq.tpi.persistencia.alumnos.dao.hibernate;

import java.util.List;

import unq.tpi.persistencia.alumnos.arq.dao.BaseHibernateDAO;
import unq.tpi.persistencia.alumnos.dao.AlumnoDAO;
import unq.tpi.persistencia.alumnos.model.Alumno;
import unq.tpi.persistencia.alumnos.model.Materia;

public class AlumnoDAOHibernate extends BaseHibernateDAO<Alumno> implements AlumnoDAO {
	
	public AlumnoDAOHibernate() {
		super(Alumno.class);
	}

	@Override
	public Alumno getPorLegajo(String legajo) {
		throw new RuntimeException("Implement me :(");
	}

	@Override
	public List<Alumno> getInscriptos(Materia materia) {
		throw new RuntimeException("Implement me :(");
	}

}
