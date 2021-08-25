package staticPackage;

public class StaticNonStaticVariable {

	static int i =0;
	 int counter =0;
	
	StaticNonStaticVariable(){
		i=i+1;
		counter = counter+1;
	}
	
	void m1() {
	//	static int a=10;		local variable cannot be static
		i=i+1;
		counter = counter+1;
	}
	
	public static void main(String[] args) {
		StaticNonStaticVariable a = new StaticNonStaticVariable();
		StaticNonStaticVariable a1 = new StaticNonStaticVariable();
		StaticNonStaticVariable a2 = new StaticNonStaticVariable();
		
	System.out.println(a2.i);
	System.out.println(a2.counter);
	}
}
