package staticPackage;

public class StaticBlockConstEg {

	static int max_marks;
	int a;

	StaticBlockConstEg(){
		System.out.println("Constructor");
		System.out.println(this.max_marks);
	}

	static {
		max_marks = 300;
		System.out.println("Static Block");
	}

	{	//max_marks = 300;
		System.out.println(	"this is instance block");
		a = 200;
		m1();
		m2();
	}
	
	static void m1() {
		System.out.println("static method");
	}
	void m2() {
		System.out.println("concrete/instance method");
	}
}
