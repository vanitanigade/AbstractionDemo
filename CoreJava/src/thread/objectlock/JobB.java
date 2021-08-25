package thread.objectlock;

public class JobB implements Runnable{
	
	Sample sample;
	
	public JobB(Sample sample) {
		this.sample = sample;
	}

	@Override
	public void run() {
		sample.withdraw();
	}

}
