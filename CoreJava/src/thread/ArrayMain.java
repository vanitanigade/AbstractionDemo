package thread;

public class ArrayMain {
	
	public static void main(String[] args) {
		
		Array ary = new Array();
		
		Thread t1 = new Thread(ary);
		Thread t2 = new Thread(ary);
		Thread t3 = new Thread(ary);
		
		int t[] = {62,43,84,445,76};
		for(int temp: t) 
			System.out.print(temp + " ");		//printed original array
			
		System.out.println();
		
			t1.setName("t1 ");
			t2.setName("t2 ");
			t3.setName("t3 ");
			
			t1.start();
			t2.start();
			t3.start();
		
		
	}

}
