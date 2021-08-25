package thread.classlockmultiplemtds;

public class JobA implements Runnable{

	@Override
	public void run() {
		Sample.m1();
	}


}
