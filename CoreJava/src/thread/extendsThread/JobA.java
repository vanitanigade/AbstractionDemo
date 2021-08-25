package thread.extendsThread;

public class JobA extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	void m1() {
		System.out.println("==m1==");
	}
	
}
