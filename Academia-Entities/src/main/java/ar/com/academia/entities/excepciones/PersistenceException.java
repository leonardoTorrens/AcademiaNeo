package ar.com.academia.entities.excepciones;


public class PersistenceException extends Exception{

	public PersistenceException(Throwable e ) {
		super(e);
	}

	public PersistenceException() {
	
	}

	private static final long serialVersionUID = 1L;

}
