package string;

import java.util.Scanner;

public class SumLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.next();
		System.out.println("entered string is: "+ s1);
				
		int l = s1.length();
		System.out.println("string length is: " + l);
		
		String s2 = "a bc";
		String s3 = "456";
		System.out.println(s2+s3);
		System.out.println("length of s2+s3: " + (s2+s3).length());
		
		int a=123, b=456;
		System.out.println(a+b);
		

		
	}

}
