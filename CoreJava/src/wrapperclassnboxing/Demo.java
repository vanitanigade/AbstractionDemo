package wrapperclassnboxing;

public class Demo {

	public static void main(String[] args) {

		int a=10;
		a=a+1;
		System.out.println(a);
		System.out.println("===========");
		
		Integer i = 30;						//OR we can write as 		Integer i = new Integer(30);
		System.out.println(i+1);
		System.out.println(i.toString()+1);	//"30" + "1" = "301"   //bcoz of toString it consider 1 also as string
		
		System.out.println("===========");
		Integer b = new Integer(20);
	/*	b = b+1;						//for this please go through below background code logic of unboxing and boxing which happens behind the screen
		System.out.println(b);	 */		
		
		int t = b.intValue();	//object to Primitive (autounboxing)
		t = t+1;	//21
		b = new Integer(t);	//Primitive to Object (autoboxing)
		System.out.println(b);
		
		
	}

}
