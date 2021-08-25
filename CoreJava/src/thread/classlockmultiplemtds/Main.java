package thread.classlockmultiplemtds;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Sample sample = new Sample();
		
		JobA joba = new JobA();
		JobB jobb = new JobB();
		JobC jobc = new JobC();
		JobD jobd = new JobD(sample);
		JobE jobe = new JobE(sample);
		JobF jobf = new JobF(sample);
		
		Thread t1 = new Thread(joba);
		Thread t2 = new Thread(jobb);
		Thread t3 = new Thread(jobc);
		Thread t4 = new Thread(jobd);
		Thread t5 = new Thread(jobe);
		Thread t6 = new Thread(jobf);
		
		t1.setName("t1: "); t2.setName("t2: "); t3.setName("t3: ");  t4.setName("t4: "); t5.setName("t5: "); t6.setName("t6: ");
		
		t1.start(); 	t2.start(); 	t3.start(); 	t4.start(); 	t5.start(); 	t6.start();
		
		t1.join();		t2.join();		t3.join();		t4.join(); 		t5.join(); 		t6.join();
		
		System.out.println("final value of Sample: " + sample.counter);
		
	}

}
