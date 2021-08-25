package abstraction.interfaces.functionalinterface;

public class A_Main {

	public static void main(String[] args) {

		A a;
		
		a = () -> {
			System.out.println("Hello");
		};
		a.m1();
		
		
		a = () -> {System.out.println("Bingo");};
		a.m1();
				
	}

}
