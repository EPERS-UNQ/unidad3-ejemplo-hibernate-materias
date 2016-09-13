package unq.tpi.persistencia.alumnos.model;

public class CursadaAlumno {
	private Alumno alumno;
	private Integer nota;
	private Materia materia;

	protected CursadaAlumno() {
	}
	
	public CursadaAlumno(Alumno alumno, Materia materia) {
		this.alumno = alumno;
		this.materia = materia;
	}

	public boolean aprobo() {
		return this.nota != null && this.nota >= 4;
	}

	public boolean estaActiva() {
		return this.nota == null;
	}

	public Integer getNota() {
		return this.nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	public Alumno getAlumno() {
		return this.alumno;
	}
	
	public Materia getMateria() {
		return this.materia;
	}
	
}
