package shalaka_intervew_ques;

import java.util.Scanner;

public class Ladder_LargestNo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a = scanner.nextInt();
		System.out.println("enter the 2nd number");
		int b = scanner.nextInt();
		System.out.println("enter the 3rd number");
		int c = scanner.nextInt();
		
		if (a>=b && a>=c)
			System.out.println("a is largest number");
		else if (b>=a && b>=c)
			System.out.println("b is largest number");
		else 
			System.out.println("c is largest number");
	}

}
