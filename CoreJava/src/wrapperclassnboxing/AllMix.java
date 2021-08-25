package wrapperclassnboxing;

public class AllMix {

	public static void main(String[] args) {

		int a=10;		// primitive data type
		
		Integer a1 = new Integer(10); 	//Wrapper --> Boxing/wrapping
										// putting value to class
		
		int y = a1.intValue();		//UnBoxing
		double d = a1.doubleValue();
		System.out.println(d);
		
		//---------------------------------------------
		
		Integer a2 = y;		//JVM - new Integer(y); --> AutoBoxing
		
		int y1 = a2;		//JVM - a2.doubleValue(); -->AutoUnBoxing
		System.out.println(y1);
	}

}
