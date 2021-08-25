package series;
// 0 1 1 2 3 5 8 13 21 34  //0+1=1 1+1=2 1+2=3 2+3=5 3+5=8 5+8=13.....
public class PrintFibonacciSeries {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int count=10;
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		for (int i=2; i<count; i++) {	//loops start from 2 as 0 & 1 are already printed
			
			int num3=num1+num2;
			System.out.print(num3 + " ");
			num1=num2;
			num2=num3;
			
		}
		
		
		
	}

}
