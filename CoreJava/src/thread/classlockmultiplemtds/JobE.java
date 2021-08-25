package thread.classlockmultiplemtds;

public class JobE implements Runnable {
	
	Sample samplee;
	
	JobE(Sample samplee){
		this.samplee = samplee;
	}

	@Override
	public void run() {
		samplee.m5();
	}

}
