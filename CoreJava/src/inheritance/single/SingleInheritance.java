package inheritance.single;

public class SingleInheritance {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		rect.display();						// calling parent method
		rect.area();						// calling its own method
		
		System.out.println(rect.a);
	}

}
