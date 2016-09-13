package unq.tpi.persistencia.alumnos.model;

import java.util.Date;

public class Profesor extends Persona {
	private String cargo;
	private Dedicacion dedicacion;
	private Date ingreso;
	
	public String getCargo() {
		return this.cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Dedicacion getDedicacion() {
		return this.dedicacion;
	}
	public void setDedicacion(Dedicacion dedicacion) {
		this.dedicacion = dedicacion;
	}

	public Date getIngreso() {
		return this.ingreso;
	}
	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	
}
