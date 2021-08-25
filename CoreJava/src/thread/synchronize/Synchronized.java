package thread.synchronize;

public class Synchronized implements Runnable{


	int arr[];

	Synchronized(int arr[]){
		this.arr = arr;
	}


	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<arr.length; i++) {
				System.out.println(Thread.currentThread().getName()+" "+ arr[i]);
			}
		}
	}
}
