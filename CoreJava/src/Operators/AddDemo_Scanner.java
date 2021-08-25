package Operators;

import java.util.Scanner;

public class AddDemo_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		a=scanner.nextInt();
		System.out.println("enter the second number");
		b=scanner.nextInt();
		c=a+b;
		System.out.println("value of c= "+c);
		
	}

}
