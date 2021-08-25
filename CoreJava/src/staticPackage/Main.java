package staticPackage;

public class Main {

	public static void main(String[] args) {

		StaticBlockConstEg sb = new StaticBlockConstEg();
		System.out.println("=====================");
		StaticBlockConstEg sb2 = new StaticBlockConstEg();
		System.out.println("============================");
		System.out.println(StaticBlockConstEg.max_marks);
		StaticBlockConstEg.m1();
		
	}

}
