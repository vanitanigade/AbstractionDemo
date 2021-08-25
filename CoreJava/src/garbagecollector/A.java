package garbagecollector;

public class A {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is object of A");	
	}
	
}
