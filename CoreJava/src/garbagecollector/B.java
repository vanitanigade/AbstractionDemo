package garbagecollector;

public class B {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is object of B");	
	}


}
