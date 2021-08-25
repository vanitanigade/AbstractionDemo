package series;

import java.util.Scanner;

public class PerfectNumber {					//PerfectNo: 6=1+2+3 & 6/1, 6/2, 6/3 =0 sum of its positive dividers except number itself
	public static void main(String[] args) {

		int sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any integer you want to check");
		int n = sc.nextInt();

		for(int i=1; i<n; i++) {

			if(n%i==0) 		//6%1, 6%2, 6%3, 6%4, 6%5 this step is to find factors from 6%4!=0
				sum= sum+i;			//sum=0+1=1, 1+2=3, 3+3=6
		}
		if (sum==n) 
			System.out.println("number is perfect number");
		else 
			System.out.println("number is not perfect number");
	} 


}
