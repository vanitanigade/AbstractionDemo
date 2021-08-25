package thread.globalvariableWithMethod;

public class A {
	
	int sum;
	
	int m1() {
		
		for(int i=0; i<=10; i++) {
			sum = sum+i;
		}
		return sum;
	}

}
