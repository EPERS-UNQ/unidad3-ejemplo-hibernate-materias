package unq.tpi.persistencia.alumnos.dao;

import java.util.List;
import unq.tpi.persistencia.alumnos.model.Persona;

public interface PersonaDAO {
	
	/**
	 * Devuelve todas las personas
	 */
	List<Persona> getAll();

}
