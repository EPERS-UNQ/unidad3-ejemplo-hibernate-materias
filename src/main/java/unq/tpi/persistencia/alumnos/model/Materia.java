package unq.tpi.persistencia.alumnos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a una Materia. Una materia tiene una lista de cursos,
 * la cual esta ordenada cronologicamente (los cursos mas nuevos se
 * encuentran al final de la lista).
 * 
 * Se una Materia solo puede tener un curso vigente (de este cuatrimestre).
 * El resto de los cursos son informacion historica.
 */
public class Materia {
	private Integer id;
	private List<Curso> cursos = new ArrayList<>();
	private String codigo;

	/**
	 * Devuelve el curso vigente de esta materia.
	 */
	public Curso getCursoActual() {
		return  this.cursos.get(this.cursos.size() - 1);
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Curso> getCursos() {
		return this.cursos;
	}
	public void addCurso(Curso curso) {
		this.cursos.add(curso);
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
