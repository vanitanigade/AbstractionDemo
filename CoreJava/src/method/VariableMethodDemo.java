package method;

import staticPackage.Practice;

public class VariableMethodDemo {

	int x=10;
	void m1(int y) {
		x=x+1;
		y=y+1;
		System.out.println(x + " " + y);
	}

	void m2(int y) {
		x=x+1;
		y=y+1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x + " " + y);
	}


	public static void main(String[] args) {
		VariableMethodDemo p = new VariableMethodDemo();
		p.m1(10);
		p.m1(20);
		p.m2(30);
		p.m2(40);
	}
}
