package thread.synchronize;

public class EvenOddMain {

	public static void main(String[] args) {

		EvenJob ej = new EvenJob();
		OddJob oj = new OddJob();

		Thread ej1 = new Thread(ej,"ej1: ");			//OR we can write as ej1.setName("ej1: ");
		Thread ej2 = new Thread(ej,"ej2: ");
		Thread ej3 = new Thread(ej,"ej3: ");

		Thread oj1 = new Thread(oj,"oj1: ");

		ej1.start();
		ej2.start();
		ej3.start();
		oj1.start();

		System.out.println("================");

	}

}
