package unq.tpi.persistencia.alumnos.exceptions;

public class CalificacionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CalificacionException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalificacionException(String message) {
		super(message);
	}
	
}
