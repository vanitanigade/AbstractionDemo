package inheritance.hierarchical;

public class Main {
	
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		
		b.methodA();
		b.methodB();
		
		c.methodA();
		c.methodC();
		
		d.methodA();
		d.methodD();
	}

}
