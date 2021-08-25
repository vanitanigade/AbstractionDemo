package Operators.bitwise;

public class Shift {

	public static void main(String[] args) {

		/*  left shift(<<)
		b = a<<n -> b= a x (2)^n
		b= 12<<1 ->	b= 12 x (2)^1 = 12x2 = 24	
		 */		
		System.out.println(12<<1);


		/*  right shift(<<)
		b = a>>n -> b= a / (2)^n
		b= 50>>2 ->	b= 50 / (2)^2 = 50/4 = 12	
		 */
		System.out.println(50>>2);

	}

}
