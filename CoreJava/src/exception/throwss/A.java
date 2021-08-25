package exception.throwss;

public class A {
	
	void m1() throws ClassNotFoundException {
		Class.forName("hello.test");
	}

}
