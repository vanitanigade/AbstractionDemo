package thread.classlockmultiplemtds;

public class JobD implements Runnable{
	
	Sample sampled;
	
	JobD(Sample sampled){
		this.sampled = sampled;
	}

	@Override
	public void run() {
		sampled.m4();
	}

}
