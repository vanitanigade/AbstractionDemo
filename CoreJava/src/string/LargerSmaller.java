package string;

import java.util.Scanner;

public class LargerSmaller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string1");
		String str1 = sc.next();
		System.out.println("enter string2");
		String str2 = sc.next();
		
		if(str1.length() > str2.length())
			System.out.println("string 1 is larger");
		else 
			System.out.println("string 1 is smaller");
	}

}
