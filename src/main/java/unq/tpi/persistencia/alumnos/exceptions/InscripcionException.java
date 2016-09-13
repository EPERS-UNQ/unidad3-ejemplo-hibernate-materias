package unq.tpi.persistencia.alumnos.exceptions;

public class InscripcionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InscripcionException(String message, Throwable cause) {
		super(message, cause);
	}

	public InscripcionException(String message) {
		super(message);
	}

}
