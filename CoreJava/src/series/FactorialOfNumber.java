package series;
//1!=1x1=1 2!=2x1=2x1!=2 3!=3x2x1=3x2!=6 4!=4x3x2x1=4x3!=24...5!=5x4!=24x5=120......
import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			factorial = factorial*i;
			System.out.print(factorial + " ");
		}
	/*	1	1	1	1
		2	2 × 1	= 2 × 1!	= 2
		3	3 × 2 × 1	= 3 × 2!	= 6
		4	4 × 3 × 2 × 1	= 4 × 3!	= 24
		5	5 × 4 × 3 × 2 × 1	= 5 × 4!	= 120
		
	*/	
	}
	
	
}
