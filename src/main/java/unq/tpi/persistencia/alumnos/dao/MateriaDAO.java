package unq.tpi.persistencia.alumnos.dao;

import unq.tpi.persistencia.alumnos.model.Materia;

public interface MateriaDAO {
	
	/**
	 * Devuelve la materia con el código provisto
	 */
	Materia getPorCodigo(String codigoMateria);

	/**
	 * Guarda una nueva materia en el medio persistente
	 */
	void save(Materia materia);

	/**
	 * Devuelve la cantidad de aprobados para una materia (dado su código)
	 */
	Integer getCantidadAprobados(String codigoMateria);

}
