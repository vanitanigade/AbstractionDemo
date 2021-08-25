package thread.classlockmultiplemtds;

public class JobC implements Runnable{
	
	
	@Override
	public void run() {
		Sample.m3();
	}

}
