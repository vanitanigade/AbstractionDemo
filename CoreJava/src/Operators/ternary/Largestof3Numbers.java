package Operators.ternary;

public class Largestof3Numbers {

	public static void main(String[] args) {


		int a=12, b=3, c=4;
		int largest =  (c> ((a>b)? a:b)) ? c:((a>b)? a:b);
		int smallest = (c< ((a<b)? a:b)) ? c:((a<b) ? a:b);
		int middle =  (c > ((a<b)? a:b)) ? c: ((a<b)? a:b);		//int a=3, b=4, c=12;
	//	int middle1 = (a>b) ? ((c>a)? a:((b>c)? b:c)) : ((c>b)? b:((a<c)?a:c)); //int a=4, b=12, c=3;
		
		System.out.println("largest "+largest);
		System.out.println("smallest "+smallest);
		System.out.println("middle "+middle);
		
	 	// int d=a+b+c-largest-Minimum; Working for all


		int maxNo = (a>b) ? ((a>b)?a:b) : ((a>c)?a:c);
		int minNo = (a<b) ? ((a<b)?a:b) : ((a<c)?a:c);
	
		System.out.println("maxNo "+maxNo);
		System.out.println("minNo "+minNo);
		
		int x = ((a>b)? a:b);
		int y = ((a<b)? a:b);
		int largestNumber = (c>x) ? c:x ;
		int smallestNumber = (c<y) ? c:y ;
		System.out.println("largestNumber "+largestNumber);
		System.out.println("smallestNumber "+smallestNumber);


		int num1=5, num2=6, num3=7;

		int temp1=(num1>num2) ? num1:num2;
		int max = (temp1>num3) ? temp1:num3;
		System.out.println("max "+max);

		int temp2=(num1<num2) ? num1:num2;
		int min = (temp2<num3) ? temp2:num3;
		System.out.println("min "+min);

	}

}
