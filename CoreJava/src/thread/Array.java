package thread;

public class Array implements Runnable{

	@Override
	public void run() {

		int arr[] = {62,43,84,445,76};

		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0 && Thread.currentThread().getName().equals("t1 "))		// we never hardcode array but here for understanding only
				System.out.println(Thread.currentThread().getName()+" Even: " + arr[i]);		
			else if(arr[i]%2 != 0 && Thread.currentThread().getName().equals("t2 "))
				System.out.println(Thread.currentThread().getName()+" Odd: "+ arr[i]);
		}

	}



}
