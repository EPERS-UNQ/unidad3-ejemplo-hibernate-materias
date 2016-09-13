package unq.tpi.persistencia.alumnos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una comision particular de una Materia. Dicha comision
 * puede ser actual o historica (cursos de cuastrimestres anteriores)
 */
public class Curso {
	private Profesor profesor;
	private Profesor instructor;
	
	private Materia materia;
	private List<CursadaAlumno> cursadas = new ArrayList<>();

	protected Curso() {
	}
	
	public Curso(Materia materia) {
		this.materia = materia;
	}
	
	/**
	 * Inscribe a un Alumno en esta cursada en particular
	 */
	public CursadaAlumno  inscribir(Alumno alumno) {
		CursadaAlumno cursada =  new CursadaAlumno(alumno, this.materia);
		this.cursadas.add(cursada);
		return cursada;
	}
	
	public Profesor getProfesor() {
		return this.profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public void setInstructor(Profesor instructor) {
		this.instructor = instructor;
	}
	public Profesor getInstructor() {
		return this.instructor;
	}
	
	public Materia getMateria() {
		return this.materia;
	}

}
