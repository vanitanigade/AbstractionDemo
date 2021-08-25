package abstraction.interfaces;

public interface A {
	
	int a=20;	// public static final int a=20; OR constant
	
	void m1();	// public abstract m1();
	void m2();
	
	static void m3() {
		System.out.println("====static method====");
	}
	
	default void m4() {
		System.out.println("===default method=====");
	}
	

}
