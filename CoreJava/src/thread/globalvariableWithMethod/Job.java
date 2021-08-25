package thread.globalvariableWithMethod;

public class Job implements Runnable {

	/*	A t = new A();
	
	@Override
	public void run() {
		t.m1();
	}
*/
	
	int sum = 0;
	
	@Override
	public void run() {
		
		for(int i=0; i<=10; i++) {
			sum=sum+i;
			System.out.println(Thread.currentThread().getName() + " : " + sum);
		}
		
	}
	
	
	
}
