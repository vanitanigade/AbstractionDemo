package Operators.bitwise;

public class Not_Compliment_Negation {

	public static void main(String[] args) {

		int a=3;
		int b= -10;
		
		System.out.println(~a); // minus (total positive values starting from 0) => -(0 1 2 3) => -(4) => -4
		System.out.println(~b);	// values between 0 and -10 => -9 -8 -7 -6 -5 -4 -3 -2 -1  => 9
				
		
		int c = 5;
		int d = -15;
		System.out.println(~c);
		System.out.println(~d);
	}

}
