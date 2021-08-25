package wrapperclassnboxing;

public class Unboxing {

	public static void main(String[] args) {

		// java program to convert object into primitives
		// Unboxing example of converting Integer into int
		
		Integer a = new Integer(3);
		int i = a.intValue();		//conveting Integer to int explicitly
		int j=a;					//unboxing, now compiler will write a.intValue() internally
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println("=============================");
		
		
		Integer b = new Integer(45);
		int k = b;
		System.out.println(k);
		
	   
		
	}

}
