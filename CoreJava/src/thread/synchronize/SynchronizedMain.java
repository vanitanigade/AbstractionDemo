package thread.synchronize;

public class SynchronizedMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		int a[] = {45,56,12,35,78};
		
		Synchronized sy = new Synchronized(a);
		
		Thread t1 = new Thread(sy);
		Thread t2 = new Thread(sy);
		Thread t3 = new Thread(sy);
		
		t1.setName("t1 ");
		t2.setName("t2 ");
		t3.setName("t3 ");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("======end of main method=======");
	}

}
