package thread;

public class JobC_Main {

	public static void main(String[] args) throws InterruptedException {

		JobC jobc = new JobC();

		Thread t1 = new Thread(jobc);
		Thread t2 = new Thread(jobc);
		Thread t3 = new Thread(jobc);

		t1.setName("first thread: ");
		t2.setName("second thread: ");
		t3.setName("third thread: ");

		t1.start();
		t2.start();
		t3.start();
		
	//	t1.join();
		t2.join();
	//	t3.join();
		
		System.out.println("=======end of main method=========");
		
	}
	
}