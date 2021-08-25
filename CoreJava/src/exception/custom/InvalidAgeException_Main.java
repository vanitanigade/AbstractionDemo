package exception.custom;

public class InvalidAgeException_Main {

	public static void main(String[] args) {

		System.out.println("00");

		try {	//db con...
			//fiel f = abc.text
			System.out.println("11");
			int p=10/0;					//throw new Arithmetic exception -> by JVM
			int age = -12;
			if(age<0)
				throw new InvalidAgeException("age not valid");
			System.out.println("22");

		}catch(Exception e1) {			//Exception e1=	new Arithmetic exception
			System.out.println("33");
			e1.printStackTrace();
			System.out.println(e1);		// OR System.out.println(e1.toString());  //toString() called here
		}finally {
			System.out.println("finally executed");
			//con.close();
			//f.close();
		}
		System.out.println("44");

	}

}
