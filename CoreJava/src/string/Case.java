package string;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		
		System.out.println("Uppercase string: " + str.toUpperCase());
		System.out.println("lowercase string: " + str.toLowerCase());
		
	}

}
