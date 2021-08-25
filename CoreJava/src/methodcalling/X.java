package methodcalling;

public class X {
			
/*	void m1(Y y, String ss) {		// code without constructor 
		y.mz(ss);
	}
	
	void m2(Y y, int u) {
		y.mzz(u);
	}
*/
	Y y= null;

	X(Y y){				//15 line code in XY_Main is related to this constructor
		this.y = y;
	}
			//OR
	X(){				//20 line code in XY_Main is related to this constructor
		y = new Y();
	}
	
	void m1(String ss) {		
		y.mz(ss);
	}
	
	void m2(int u) {
		y.mzz(u);
	}
}
