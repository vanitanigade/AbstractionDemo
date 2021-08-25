package practice;

public class PassByValueNRef {

	public static void main(String[] args) {

		int a=10, b=20;
		add1(a, b);
		System.out.println("a is: " + a);	//15

		StringBuilder s1 = new StringBuilder("java");
		add2(s1);
		System.out.println(s1);
	}

	private static void add1(int a, int b) {
		a=a+5;
	}

	private static void add2(StringBuilder s1) {
		s1.append("updated");
	}
}