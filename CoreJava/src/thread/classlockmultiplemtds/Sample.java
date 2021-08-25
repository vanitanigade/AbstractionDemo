package thread.classlockmultiplemtds;

public class Sample {

	static int counter;

	synchronized static void m1() {
		System.out.println("=========================");
		for(int i=1; i<=2000; i++) {
			counter= counter+1;
			System.out.println(Thread.currentThread().getName() + " m1(+1): " + i);
		}
	}

	synchronized static void m2() {
		System.out.println("===========================");
		for(int i=1; i<=2000; i++) {
			counter= counter+1;
			System.out.println(Thread.currentThread().getName() + " m2(+1): " + i);
		}
	}

	synchronized static void m3() {
		System.out.println("======================");
		for(int i=1; i<=2000; i++) {
			counter = counter+1;
			System.out.println(Thread.currentThread().getName() + " m3(+1): " + i);
		}
	}
	
	synchronized  void m4() {
		System.out.println("=========================");
		for(int i=1; i<=2000; i++) {
			counter= counter+1;
			System.out.println(Thread.currentThread().getName() + " m4(+1): " + i);
		}
	}

	synchronized  void m5() {
		System.out.println("===========================");
		for(int i=1; i<=2000; i++) {
			counter= counter+1;
			System.out.println(Thread.currentThread().getName() + " m5(+1): " + i);
		}
	}

	synchronized  void m6() {
		System.out.println("======================");
		for(int i=1; i<=2000; i++) {
			counter = counter+1;
			System.out.println(Thread.currentThread().getName() + " m6(+1): " + i);
		}
	}


}
