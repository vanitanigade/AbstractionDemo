package string;

public class Concat {

	public static void main(String[] args) {

		String first = "Java";			//create first string
		System.out.println("first string: "+ first);
		
		String second = "bykiran";
		System.out.println("second string: "+ second);
		
		String joinedString = first.concat(second);
		System.out.println("joined string: "+ joinedString);
	}

}
