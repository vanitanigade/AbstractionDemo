package switch_case;

public class Operators {
	public static void main(String[] args) {
		
		int a=10, b=20;
		char ch ='-';
		
		switch(ch) 
		{
		case '+' :
				System.out.println("a+b= "+(a+b));
				break;
		case '-' : 
				System.out.println("a-b= "+(a-b));
				break;
		case '*':
				System.out.println("a*b= "+(a*b));
				break;
		case '/' :
				System.out.println("a/b= "+(a/b));
				break;
		case '%' :
				System.out.println("a%b= "+(a%b));
				break;
		default: System.out.println("invalid operator");
		
		
		}
		
		
	}

}
