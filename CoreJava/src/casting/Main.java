package casting;

public class Main {

	public static void main(String[] args) {
		
		A a = new B();
		a.m1();
	
	/*	B b = new B();
		b.m1();
		b.m2();
	*/	
		B b = (B)a;		//instead of creating new object of B, did casting
		b.m1();
		b.m2();

	}

}
