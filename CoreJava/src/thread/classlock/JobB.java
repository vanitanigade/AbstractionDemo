package thread.classlock;

public class JobB implements Runnable{
	
	Sample sampleb;
	
	public JobB(Sample sampleb) {
		this.sampleb = sampleb;
	}

	@Override
	public void run() {
		sampleb.m2();
	}

}
