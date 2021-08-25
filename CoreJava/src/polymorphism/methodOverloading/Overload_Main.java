package polymorphism.methodOverloading;

public class Overload_Main {

	public static void main(String[] args) {

		Overload ov = new Overload();
		ov.sum(10);
		ov.sum(20.05);
		ov.sum(20, 30);
		ov.sum(42.05, 56.98);
		ov.sum(45, 56.45);
		ov.sum(78.95, 45);
	}

}
