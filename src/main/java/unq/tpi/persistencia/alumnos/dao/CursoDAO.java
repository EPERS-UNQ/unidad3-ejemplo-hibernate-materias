package unq.tpi.persistencia.alumnos.dao;

import java.util.List;

import unq.tpi.persistencia.alumnos.model.Curso;
import unq.tpi.persistencia.alumnos.model.Materia;

public interface CursoDAO {
	
	/**
	 * Recupera todos los {@link Curso} asociados a una {@link Materia} en particular
	 */
	List<Curso> getCursosMateria(Materia materia);

}