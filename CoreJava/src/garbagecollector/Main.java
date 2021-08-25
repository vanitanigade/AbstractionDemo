package garbagecollector;

public class Main {

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A();
		B b = new B();
		
		a2 = null;
		b = null;
		
		System.gc();	//finalize method run before gc to delete the null objects i.e. objects which are not used anywhere or not in use.
		System.gc();	//If there is no null objects then finalize method will not run
		System.gc();
	}

}
