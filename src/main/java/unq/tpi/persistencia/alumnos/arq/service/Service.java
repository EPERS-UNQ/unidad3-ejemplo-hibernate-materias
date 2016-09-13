package unq.tpi.persistencia.alumnos.arq.service;

import unq.tpi.persistencia.alumnos.arq.service.runner.Runner;

/**
 * Tipo base para todos los servicios
 */
public abstract class Service {
	
	private final Runner runner;
	
	public Service(Runner runner) {
		this.runner = runner;
	}
	
	/**
	 * Ejecuta un comando en el runner asociado a este servicio
	 */
	protected <T> T execute(ServiceCommand<T> command) {
		return this.runner.run(command);
	}
	
}