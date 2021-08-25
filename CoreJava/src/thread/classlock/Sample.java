package thread.classlock;

public class Sample {

	static int counter;

	synchronized static void m1() {
		System.out.println("=========================");
		for(int i=1; i<=2000; i++) {
			counter= counter+1;
			System.out.println(Thread.currentThread().getName() + " m1(+1): " + i);
		}
	}

	synchronized void m2() {
		System.out.println("===========================");
		for(int i=1; i<=2000; i++) {
			counter= counter-1;
			System.out.println(Thread.currentThread().getName() + " m2(-1): " + i);
		}
	}

	synchronized void m3() {
		System.out.println("======================");
		for(int i=1; i<=2000; i++) {
			counter = counter+3;
			System.out.println(Thread.currentThread().getName() + " m3(+3): " + i);
		}
	}

}
