package abstraction.abstractclass;

public class Sub extends Parent {

	int x, y, z;
	
	@Override
	void get(int a, int b) {
		x=a;
		y=b;
	}

	@Override
	void add() {
		z=x+y;
	}

	@Override
	void display() {
		System.out.println("Addition is: " + z);
	}
	
	

}
