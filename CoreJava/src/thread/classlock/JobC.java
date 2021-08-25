package thread.classlock;

public class JobC implements Runnable{
	
	Sample samplec;
	
	JobC(Sample samplec){
		this.samplec = samplec;
	}

	@Override
	public void run() {
		samplec.m3();
	}

}
