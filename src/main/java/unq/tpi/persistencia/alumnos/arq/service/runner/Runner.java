package unq.tpi.persistencia.alumnos.arq.service.runner;

import unq.tpi.persistencia.alumnos.arq.service.ServiceCommand;

/**
 * Executa un ServiceCommand
 */
public interface Runner {
	
	<T> T run(ServiceCommand<T> command);

}
