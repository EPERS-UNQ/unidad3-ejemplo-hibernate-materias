package unq.tpi.persistencia.alumnos.model;

import java.util.List;

public class Persona {
	private Integer id;
	private String nombre;
	private String apellido;
	private String legajo;

	private List<String> mails;

	public String getMailPrincipal() {
		return this.mails.get(0);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return this.legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public List<String> getMails() {
		return this.mails;
	}

	public void setMails(List<String> mails) {
		this.mails = mails;
	}

}
