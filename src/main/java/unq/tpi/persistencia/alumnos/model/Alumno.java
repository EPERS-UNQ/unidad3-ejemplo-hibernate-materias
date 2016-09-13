package unq.tpi.persistencia.alumnos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import unq.tpi.persistencia.alumnos.exceptions.CalificacionException;
import unq.tpi.persistencia.alumnos.exceptions.InscripcionException;

/**
 * Representa a un alumno de la facultad. El mismo tiene una lista de cursadas
 * (activas y no activas)
 */
public class Alumno extends Persona {
	private Date ingreso;
	private List<CursadaAlumno> cursadas = new ArrayList<>();

	public void inscribirA(Materia materia) {
		if (this.aprobo(materia)) {
			throw new InscripcionException("El alumno ya tiene aprobada la materia");
		}
		
		if (this.estaInscripto(materia)) {
			throw new InscripcionException("El alumno ya esta inscripto");
		}
		
		CursadaAlumno cursada = materia.getCursoActual().inscribir(this);
		this.cursadas.add(cursada);
	}
	
	public boolean aprobo(Materia materia) {
		return this.cursadas.stream()
			.filter(cursada -> cursada.getMateria().equals(materia))
			.filter(cursada -> cursada.aprobo())
			.findAny().isPresent();
	}
	
	public boolean estaInscripto(Materia materia) {
		return this.cursadas.stream()
				.filter(cursada -> cursada.getMateria().equals(materia))
				.findAny().isPresent();
	}

	public CursadaAlumno getCursadaActual(Materia materia) {
		return this.cursadas.stream()
				.filter(cursada -> cursada.getMateria().equals(materia))
				.filter(cursada -> cursada.estaActiva())
				.findFirst()
				.orElse(null);
	}

	public void calificar(Materia materia, int nota) {
		CursadaAlumno actual = this.getCursadaActual(materia);
		if (actual == null) {
			throw new CalificacionException("No tiene una inscripcion a la materia");
		}
		actual.setNota(nota);
	}

	public Date getIngreso() {
		return this.ingreso;
	}
	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	
}
