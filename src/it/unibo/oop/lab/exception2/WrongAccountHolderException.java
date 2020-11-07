package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final int id;

	public WrongAccountHolderException(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "WrongAccountHolderException [id=" + id + "]";
	}
	
	
    public String getMessage() {
        return this.toString();
    }
	

}
