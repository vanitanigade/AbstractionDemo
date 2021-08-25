package thread.extendsThread;

public class JobA_Main {
	
	public static void main(String[] args) {
		
		JobA joba = new JobA();
		Thread t1 = new Thread(joba);
		Thread t2 = new Thread(joba);
		Thread t3 = new Thread(joba);
		joba.run();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
