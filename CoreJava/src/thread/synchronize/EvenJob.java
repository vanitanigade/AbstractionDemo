package thread.synchronize;

public class EvenJob implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<5; i++) {
				try {if(i%2==0)

					Thread.currentThread().sleep(1000);
				System.out.println(Thread.currentThread().getName() + i);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
