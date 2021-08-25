package exception.finallyy;

public class FinallyError1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int r = a/b;		//exception will occur at this line which is not inside try catch block so finally will not be executed					

		try{
		//	int r=a/b;
			System.out.println("result: " + r);

		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("exception is handled");
		}finally {
			System.out.println("finally block is executed");
		}
	}

}
