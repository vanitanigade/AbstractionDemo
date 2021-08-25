package series;

import java.util.Scanner;

public class ReverseNumber_WhileLoop {
	public static void main(String[] args) {
		
		int num, remainder, reverse=0;						//reverse or sum of digits 123=1+2+3=6
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number you want to check");
		num = scanner.nextInt(); 				//num=123
		while(num !=0) {						//123!=0 true  //num=12//12!=0 true  //num=1//1!=0 true//num=0//0!=0  //false
			
			remainder = num%10; 			//123%10-> digit=3  //12%10-> digit=2  //1%10 ->digit=1
			reverse = reverse * 10 + remainder;   //0*10+3-> rev=3  //3*10+2-> rev=32  //32*10+1 //321   //reverse or sum of digits 123=1+2+3=6
			num= num/10; 						 //num=num/10;//123/10 -> num=12  //num=12/10 //num=1  //1/10//num=0
		}
		//scanner.close();
		System.out.println("Reversed number: "+reverse);  //rev=321
	}

}
