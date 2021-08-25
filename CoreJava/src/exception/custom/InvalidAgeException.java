package exception.custom;

public class InvalidAgeException extends Exception{
	
	String msg;

	public InvalidAgeException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [msg=" + msg + "]";
	}
	
	
	
	
	

}
