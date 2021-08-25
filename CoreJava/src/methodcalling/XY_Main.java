package methodcalling;

public class XY_Main {

	public static void main(String[] args) {
		
/*		X xx = new X();			//code without constructor of X class
		Y yy = new Y();
		
		xx.m1(yy, "mango");
		xx.m2(yy, 55);
*/	
		// below code after creating constructor of X class
		
		Y yy = new Y();
		X xx = new X(yy);
		xx.m1("hello");
		xx.m2(45);
	
		X xxx = new X();
		xxx.m1("hi");
		xxx.m2(45);
		
	}

}
