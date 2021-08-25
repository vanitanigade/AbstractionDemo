package abstraction.interfaces.functionalinterface;

public class B_Main {

	public static void main(String[] args) {

		B b;
		b = (int t) -> {
			System.out.println("Hello " + (t+10));
			};
		b.m1(10);
	}

}
