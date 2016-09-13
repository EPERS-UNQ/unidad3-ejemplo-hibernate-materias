package unq.tpi.persistencia.alumnos.services;

import java.util.List;

import unq.tpi.persistencia.alumnos.arq.service.Service;
import unq.tpi.persistencia.alumnos.arq.service.runner.Runner;
import unq.tpi.persistencia.alumnos.model.Alumno;
import unq.tpi.persistencia.alumnos.model.Curso;
import unq.tpi.persistencia.alumnos.model.Materia;

public class MateriaService extends Service {
	
	public MateriaService(Runner runner) {
		super(runner);
	}
	
	/**
	 * Devuelve la cantidad de aprobados de la materia especificada
	 */
	public int getCantidadAprobados(String codigoMateria) {
		return this.execute(locator -> {
			return locator.getMateriaHome().getCantidadAprobados(codigoMateria);
		});
	}
	
	/**
	 * Devuelve los cursos de la materia especificada
	 */
	public List<Curso> getCursosMateria(String codigoMateria) {
		return this.execute(locator -> {
			Materia materia = locator.getMateriaHome().getPorCodigo(codigoMateria);
			return locator.getCursoHome().getCursosMateria(materia);
		});
	}
	
	/**
	 * Devuelve los cursos de la materia especificada
	 */
	public List<Alumno> getListaInscriptos(String codigoMateria) {
		return this.execute(locator -> {
			Materia materia = locator.getMateriaHome().getPorCodigo(codigoMateria);
			return locator.getAlumnoHome().getInscriptos(materia);
		});
	}
	
}