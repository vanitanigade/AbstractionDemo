package exception.throwss;

public class Main {

	public static void main(String[] args)  {
		
		C c = new C();
		try {
			c.m3();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("=======bye bye======");
	}
	
	
}
