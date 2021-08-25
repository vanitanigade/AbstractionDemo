package wrapperclassnboxing;

public class Autoboxing {

	public static void main(String[] args) {
		//converting int into integer
		int a=20;
		Integer i = Integer.valueOf(a); 	//converting int into Integer explicitly
		
		Integer j = a;						//autoboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println(a + " " + i + " " + j);
		
		Integer i1 = new Integer(a);
		System.out.println(i1);
		
		System.out.println("=============================");
		
		
		/*String s1="123abc";				//can't convert abc to integer in any language as "123abc" its not valid integer
	      Integer i1=new Integer(s1);
	      System.out.println(i1);		*/		
		
	      String s2="123";						//autoboxing converting 'String' special data type to Integer
	      Integer i2=new Integer(s2);
	      System.out.println(i2);

		     

	}

}
