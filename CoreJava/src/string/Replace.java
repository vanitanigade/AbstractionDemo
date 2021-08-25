package string;

public class Replace {

	public static void main(String[] args) {

		String str = "C++ Programming";
		
		System.out.println(str.replace("C++", "Java"));		//all occurrences of C++  is replated with Java
		
		System.out.println("aa bb aa".replace("aa", "zz"));
		
		System.out.println("Java Language".replace("Language", "code"));
	}

}
