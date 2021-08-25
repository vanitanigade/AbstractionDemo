package Operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=12, b=12;
		int result1, result2, result3, result4;
		
		System.out.println("value of a= "+a);
		
		result1 = ++a;
		System.out.println(result1);
		System.out.println(a);
				
		result2 = --b;
		System.out.println(result2);
		System.out.println(b);
		
		result3 = a++;      //as per line no 15, value of a=13, so 13++
		System.out.println(result3);
		System.out.println(a);
		
		result4 = b--;		//as per line no 19, value of b=11, so 11--
		System.out.println(result4);
		System.out.println(b);
				
		
	}

}
