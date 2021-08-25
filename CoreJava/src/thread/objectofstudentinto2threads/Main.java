package thread.objectofstudentinto2threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Student s = new Student(105, "abhi");
		
		JobA joba = new JobA(s);
		JobB jobb = new JobB(s);
		
		Thread t1 = new Thread(joba);
		Thread t2 = new Thread(jobb);
		
	//	t1.setPriority(10);
	//	t2.setPriority(5);
		t1.start();
		t2.start();		//if t2 start first and t1 second then print "Rohan"
		
		t1.join();
		t2.join();
		
		System.out.println(Thread.currentThread().getName() + " : " + s);
	}

}
