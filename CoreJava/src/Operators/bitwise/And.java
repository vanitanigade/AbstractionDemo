package Operators.bitwise;

public class And {

	public static void main(String[] args) {

		int x = 8;
		int y = 9;
		
		System.out.println(x&y);
	}
}
	/*	x   y  X&Y
		0	0	0
		0	1	0
		1	0	0
		1	1	1
		
		 x=8=1000 -> binary value of 8
		 y=9=1001 -> binary value of 9
		 x&y=1000=8
*/