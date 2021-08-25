package abstraction.abstractclass;

public class AbstractDemo_Main {
	
	public void display1() {
		System.out.println("display1");
	}
	
	public void display2() {
		System.out.println("display2");
	}

	public static void main(String[] args) {

		AbstractDemo_Main main = new AbstractDemo_Main();
		main.display1();
		main.display2();
	}

}
