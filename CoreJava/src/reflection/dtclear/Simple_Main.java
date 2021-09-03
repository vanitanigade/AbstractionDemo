package reflection.dtclear;


public class Simple_Main {

	void print(Object obj) {
		Class c2 = obj.getClass();
		System.out.println(c2.getName());
	}
	
	public static void main(String[] args) throws ClassNotFoundException {

		Class cl = Class.forName("reflection.dtclear.Simple");
		System.out.println("1st way:   " + cl.getName());
		System.out.println(cl.isInterface());
		System.out.println(cl.isLocalClass());
				
		Class  c = Simple.class;
		System.out.println("2nd way:   " + c.getName());
		
		Simple s = new Simple();
		Simple_Main t = new Simple_Main();
		t.print(s);
	
	}

} 
