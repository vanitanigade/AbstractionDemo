package exception.finallyy;

public class FinallyError2 {

	public static void main(String[] args) {

		try{
			int a = 10;
			int b = 0;
			int r=a/b;
			System.out.println("result: " + r);

		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("exception is handled");
			System.exit(0);   								//program is closed here so finally block will not be executed
		}finally {
			System.out.println("finally block is executed");
		}
	}

}
