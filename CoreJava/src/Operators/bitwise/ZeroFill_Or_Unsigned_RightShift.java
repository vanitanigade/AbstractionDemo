package Operators.bitwise;

public class ZeroFill_Or_Unsigned_RightShift {

	public static void main(String[] args) {

	/* 	unsigned right shift(>>>)
		 a = 11110000
		 b=2
		 a>>>b=11110000>>>2=00111100=number		shift end/right 2 digits to start/left of number
	*/
		int x = 20;
		int y = 2;
		System.out.println(x>>>y);
				
	}

}
 	/*	x=20=10100
 	 *  y=2
 	 *  x>>>y=10100>>>2=00101=5
 	 */

	