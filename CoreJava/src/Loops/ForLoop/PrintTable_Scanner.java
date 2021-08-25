package Loops.ForLoop;

import java.util.Scanner;

public class PrintTable_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		
		for (int i=1; i<=10; i=i+1) {							//instead of i++ used i=i+1
			System.out.println(a+" x "+i+" = "+ a*i);
		}
	}

}
//for odd number print (int i=1; i<=10; i=i+2)
// for even number print (int i=2; i<=10; i=i+2)