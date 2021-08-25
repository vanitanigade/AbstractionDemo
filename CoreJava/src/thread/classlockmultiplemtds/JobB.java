package thread.classlockmultiplemtds;

public class JobB implements Runnable{
	
	
	@Override
	public void run() {
		Sample.m2();
	}

}
