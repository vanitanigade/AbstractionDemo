package thread.classlockmultiplemtds;

public class JobF implements Runnable{
	
	Sample samplef;
	
	JobF(Sample samplef){
		this.samplef = samplef;
	}

	@Override
	public void run() {
		samplef.m6();
	}

}
