package thread.globalvariableWithMethod;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Job j = new Job();
		
		Thread t1 = new Thread(j);
		Thread t2 = new Thread(j);
		Thread t3 = new Thread(j);
		
		t1.start();	//55
		t2.start(); //110
		t3.start(); //165
		
		t1.join();
		t2.join();
		t3.join();
		
	//	System.out.println(j.t.sum);
		System.out.println(j.sum);
	}

}
