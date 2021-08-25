package switch_case;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
		System.out.println("enter your choice of calculation");
		int ch = sc.nextInt();
		int c;

		switch(ch) {
		case 1:
			System.out.println(c=a+b);
			break;
		case 2:
			System.out.println(c=a-b);
			break;
		case 3: 
			System.out.println(c=a*b);
			break;
		case 4:
			System.out.println(c=a/b);
			break;
		default:
			System.out.println("invalid entry");
		}

	}

}
