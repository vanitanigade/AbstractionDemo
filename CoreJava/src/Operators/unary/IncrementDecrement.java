package Operators.unary;

public class IncrementDecrement {
	public static void main(String[] args) {
		
		int a = 5; int b=2;								 
		
		System.out.println((a++ + --b) * (++b - a--));   // (5 + 1) * (2 - 6) = 6*(-4) = -24
		System.out.println(a);							 // a=6  b=1 //b=2 a=5
		System.out.println(b);
		
		
		int c = 2; int d =3;
		int r = c++ + ++c + --c + ++d;
			//  2   +  4  + 3   + 4
			//  c=3	  c=4  c=3  d=4

		System.out.println(r );
		System.out.println(c);
		System.out.println(d);
	}

}
