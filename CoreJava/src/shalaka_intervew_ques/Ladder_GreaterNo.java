package shalaka_intervew_ques;

import java.util.Scanner;

public class Ladder_GreaterNo {

	public static void main(String[] args) {

		int a =100;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int b = scanner.nextInt();
		
		if (a>b)
			System.out.println("a is greater than b");
		else if(a<b)
			System.out.println("a is smaller than b");
		else 
			System.out.println("a is equal to b");
		
	}

}
