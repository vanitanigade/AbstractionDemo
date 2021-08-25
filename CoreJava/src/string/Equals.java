package string;

public class Equals {

	public static void main(String[] args) {

		String s1 = "java"; 	 	//s1,s2, s,ss & s11,s12  hashcodes are same					
		String s2 = "java";
		String s3 = "program";						
		
		System.out.println("s1==s2: " + (s1==s2));
		boolean result1 = s1.equals(s2);
		System.out.println("String s1.equals(s2): " + result1);
		System.out.println("s1==s3: " + (s1==s3));
		System.out.println("String s1.equals(s3): " + s1.equals(s3));
		System.out.println("=========================================");
		
		String s4 = "java";					
		String s5 =  new String("java");
		System.out.println("s4==s5: " + (s4==s5));
		System.out.println("s4.equals(s5): " + s4.equals(s5));
		System.out.println("=========================================");
		
		Integer a = 10, b=10;		// integer needs to take through Wrapper class to check equal method i.e. Integer and not int
		System.out.println("a==b: " + (a==b));
		System.out.println("a.equals(b): " + a.equals(b));
		System.out.println("==========================================");
		
		if(s1 == s2)
			System.out.println("both strings are equal");
		else 
			System.out.println("both string are not equal");
	}

}
