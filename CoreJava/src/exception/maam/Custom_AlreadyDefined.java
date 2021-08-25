package exception.maam;

public class Custom_AlreadyDefined {
	
	
	static void checkAge(int age) throws ArithmeticException{			//here system not prompting for write throws
		if(age >= 18) 
			System.out.println("Access granted - eligible for drivng licence");
		else
			throw new ArithmeticException("Access denied - you must be at least 18 years old");
	}

	public static void main(String[] args) {

		checkAge(17);
	}

}
