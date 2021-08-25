package swapping;

public class Swap2Numbers {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		int tempNum;
			System.out.println("Original num1= "+num1+" & num2= "+num2);
		
		tempNum=num1;
		num1=num2;
		num2=tempNum;
			System.out.println("after swapping num1= "+num1+" & num2= "+num2);
	}

}
