package unq.tpi.persistencia.alumnos.dao;

import java.util.List;

import unq.tpi.persistencia.alumnos.model.Alumno;
import unq.tpi.persistencia.alumnos.model.Materia;

public interface AlumnoDAO {
	
	Alumno getPorLegajo(String legajo);

	void save(Alumno alumno);

	List<Alumno> getInscriptos(Materia materia);

	List<Alumno> getAll();

}
