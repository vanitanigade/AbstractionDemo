package thread.objectlock;

public class Sample {
	
	int counter;
	
	synchronized void deposit() {
		System.out.println("=========================");
		for(int i=1; i<=2000; i++) {
			counter= counter+1;
			System.out.println(Thread.currentThread().getName() + "Deposited: " + i);
		}
	}
	
	void withdraw() {
		System.out.println("===========================");
		for(int i=1; i<=2000; i++) {
			counter= counter-1;
			System.out.println(Thread.currentThread().getName() + "Withdrawn: " + i);
		}
	}

}
