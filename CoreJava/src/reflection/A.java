package reflection;

public class A {
	
	public int id;
	public String name;
	
	public A() {
		System.out.println("===no args constructor===");
	}
	
	public  A(int a) {
		System.out.println("===1 para constructor===");
	}
	
	public A(int a, int b) {
		System.out.println("===2 para constructor===");
	}
	
	public void m1() {
		System.out.println("===m1 is executed===");
	}
	
	public void m2(Integer a, Integer b) {
		System.out.println("===m2 with 2 args===" + (a+b));
	}
	
	public void m2(Integer a, Integer b, Integer c) {
		System.out.println("===m2 with 3 args ===");
	}
	
	public void m3(int a, int b, int c) {
		System.out.println("=====m3====");
	}

}
