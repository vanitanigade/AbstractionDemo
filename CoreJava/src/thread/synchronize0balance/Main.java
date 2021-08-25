package thread.synchronize0balance;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Account acc = new Account();
		
		JobA joba = new JobA(acc);
		JobB jobb = new JobB(acc);
		
		Thread t1 = new Thread(joba);
		Thread t2 = new Thread(jobb);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(acc.balance);
	}

}
