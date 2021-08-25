

package series;

import java.util.Scanner;

public class ReverseNumber_ForLoop {
	public static void main(String[] args) {
		
		int num, reverse=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number you want to check");
		num= scanner.nextInt();
	// OR num = 1234;		
	while(num!=0) {		
		int remainder = num%10;
		reverse = reverse*10 + remainder;
		num = num/10;
	}
		System.out.println(reverse);
		
		
		for(;num!=0; num=num/10) {
			int remainder = num%10;
			reverse = reverse*10 + remainder;
		}
		  System.out.println(reverse);
  }
}
