package unq.tpi.persistencia.alumnos.dao.locator;

import unq.tpi.persistencia.alumnos.dao.AlumnoDAO;
import unq.tpi.persistencia.alumnos.dao.CursoDAO;
import unq.tpi.persistencia.alumnos.dao.MateriaDAO;

public interface DAOLocator {
	
	AlumnoDAO getAlumnoHome();

	MateriaDAO getMateriaHome();

	CursoDAO getCursoHome();

}
