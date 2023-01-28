package exceptionHandling;

public class CityNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CityNotFoundException() {
        super("City not found.".toUpperCase());
    }
}
