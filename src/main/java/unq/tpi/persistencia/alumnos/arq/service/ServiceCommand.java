package unq.tpi.persistencia.alumnos.arq.service;

import unq.tpi.persistencia.alumnos.arq.service.runner.Runner;
import unq.tpi.persistencia.alumnos.dao.locator.DAOLocator;

/**
 * El código de negocio de cualquier servicio terminará ejecutandose
 * dentro de un comando. Los comandos serán ejecutados por una
 * implementación de {@link Runner})
 * 
 * @param <T>
 */
@FunctionalInterface
public interface ServiceCommand<T> {
	
	public T call(DAOLocator locator);

}
