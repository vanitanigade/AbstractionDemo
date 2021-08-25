package series;

import java.util.Scanner;

public class NosDivisibleBy3n5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int first = sc.nextInt();
		System.out.println("enter last number");
		int last = sc.nextInt();
		
		for(int i=first; i<=last; i++) {
			if(i%3 == 0 && i%5 == 0)		//try || instead of &&  // i%4 !=0 not divisible by 4
			System.out.print(i + " ");
		}
	}

}
