package exception.throwss;

public class B {
	
	void m2() throws ClassNotFoundException {
		A a = new A();
		a.m1();
		System.out.println("class B");
	}

}
