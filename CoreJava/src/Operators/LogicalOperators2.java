package Operators;

public class LogicalOperators2 {

	public static void main(String[] args) {

		boolean a=true, b=false,	c=true, d=true;
		
		a&=b;			a= a&b;
		System.out.println(a);

		c|=d;	c=c||d;
		System.out.println(c);
		
	}

}
