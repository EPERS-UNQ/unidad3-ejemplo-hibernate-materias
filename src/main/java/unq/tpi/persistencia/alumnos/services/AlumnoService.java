package unq.tpi.persistencia.alumnos.services;

import unq.tpi.persistencia.alumnos.arq.service.Service;
import unq.tpi.persistencia.alumnos.arq.service.runner.Runner;
import unq.tpi.persistencia.alumnos.model.Alumno;
import unq.tpi.persistencia.alumnos.model.Materia;

public class AlumnoService extends Service {
	
	public AlumnoService(Runner runner) {
		super(runner);
	}
	
	/**
	 * Anota a un alumno a una materia
	 */
	public void anotarAMateria(String legajo, String codigoMateria) {
		this.execute(locator -> {
			Alumno alumno = locator.getAlumnoHome().getPorLegajo(legajo);
			Materia materia = locator.getMateriaHome().getPorCodigo(codigoMateria);
			
			materia.getCursoActual().inscribir(alumno);
			
			return null;
		});
	}
	
	/**
	 * Califica a un alumno
	 */
	public void calificar(String legajo, String codigoMateria, int nota) {
		this.execute(locator -> {
			Alumno alumno = locator.getAlumnoHome().getPorLegajo(legajo);
			Materia materia = locator.getMateriaHome().getPorCodigo(codigoMateria);
			
			alumno.calificar(materia, nota);
			
			return null;
		});
	}
}