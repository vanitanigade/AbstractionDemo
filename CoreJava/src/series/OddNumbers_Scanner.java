package series;

import java.util.Scanner;

public class OddNumbers_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int first = sc.nextInt();
		System.out.println("enter last number");
		int last = sc.nextInt();
		
		for(int i=first; i<=last; i++) {
			if(i%2 !=0)
			System.out.print(i + " ");
		}	
	
	}

}
