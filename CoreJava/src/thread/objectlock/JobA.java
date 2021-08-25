package thread.objectlock;

public class JobA implements Runnable{

	Sample sample;
	
	public JobA(Sample sample){
		this.sample = sample;
	}

	@Override
	public void run() {
		sample.deposit();
	}
	
	
}
