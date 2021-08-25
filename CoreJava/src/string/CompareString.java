package string;

public class CompareString {
	public static void main(String[] args) {
		
		String str1 = "Strings are immutable";
		String str2 = new String("Strings are immutable");
		String str3 = new String("Integers are not immutable");
		String s1, s2;
		s1 = "java";		//4 //similar to s2 and repeated  -> ignore -> a	//total -> 2
		s2 = "kiran";     //7 //except similar // total -> 6 //grand total -> 2+6=8
		
		int t = s1.compareTo(s2);
		System.out.println(t);
		
		int len2 = str2.length();	//letter + whitespace = 19+2 = 21
		System.out.println(len2);	
		int len3 = str3.length();	//letter + whitespace = 23+3 =26
		System.out.println(len3);
		System.out.println(len3-len2);
		
		int result = str1.compareTo(str2);
		System.out.println(result);
		
		result = str2.compareTo(str3);
		System.out.println(result);
		
		
		}

}
