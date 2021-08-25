package thread.classlock;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Sample sample = new Sample();
		
		JobA joba = new JobA();
		JobB jobb = new JobB(sample);
		JobC jobc = new JobC(sample);
		
		Thread t1 = new Thread(joba);
		Thread t2 = new Thread(jobb);
		Thread t3 = new Thread(jobc);
		
		t1.setName("t1: ");
		t2.setName("t2: ");
		t3.setName("t3: ");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("final value of Sample: " + sample.counter);
		
	}

}
