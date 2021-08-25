package thread;

public class JobC implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0; i<1000; i++) {
			if(i%100==0)
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}


}
