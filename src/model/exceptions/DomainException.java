package model.exceptions;

//Exception ele obriga a tratar
//RunTimeExpection não obriga a tratar
public class DomainException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}	
}
