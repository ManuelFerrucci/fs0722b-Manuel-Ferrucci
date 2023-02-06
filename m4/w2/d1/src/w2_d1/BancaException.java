package w2_d1;

public class BancaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String mess;

	public BancaException(String message) {
		super();
		this.mess = message;
	}

	@Override
	public String toString() {
		return "BancaException [mess=" + mess + "]";
	}
}
