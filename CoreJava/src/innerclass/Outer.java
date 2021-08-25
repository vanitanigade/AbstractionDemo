package innerclass;

public class Outer {

	void m1() {
		System.out.println("outer class m1");
	}


	class Inner{
		
		int b;
		
		void m2() {
			System.out.println("inner class m2");
		}

	}

}
