package Operators.unary;

import java.util.Scanner;

public class Increment_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		
		System.out.println("post increment "+ num++);
		System.out.println("current value of num "+ num);
		System.out.println("pre increment "+  ++num);
	}

}
