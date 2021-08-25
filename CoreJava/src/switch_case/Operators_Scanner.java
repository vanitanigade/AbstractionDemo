package switch_case;

import java.util.Scanner;

public class Operators_Scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = scanner.nextInt();
		System.out.println("enter the second number");
		int b = scanner.nextInt();
		System.out.println("enter the operator");
		char ch = scanner.next().charAt(0);

		switch(ch)
		{
		case '+' :
			System.out.println("a+b= "+(a+b));
			break;
		case '-' : 
			System.out.println("a-b= "+(a-b));
			break;
		case '*':
			System.out.println("a*b= "+(a*b));
			break;
		case '/' :
			System.out.println("a/b= "+(a/b));
			break;
		case '%' :
			System.out.println("a%b= "+(a%b));
			break;
		default: System.out.println("invalid operator");
		}
	}

}
