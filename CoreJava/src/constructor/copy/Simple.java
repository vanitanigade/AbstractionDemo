package constructor.copy;

public class Simple {

	private int a, b;

	public Simple(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Simple(Simple c){
		System.out.println("copy constructor called");
		a= c.a;
		b= c.b;
	}

	//@Override 						//Overriding the toString of Object Class
	public String toString() {
		return "("+a + b+")";
	}

	public static void main(String[] args) {
		Simple s1 = new Simple(10, 15);
		Simple s2 = new Simple(s1);  //copy constructor called here
		System.out.println(s1);		//toString of s1 called here
		System.out.println(s2);		//toString of s2 called here
	}

}
