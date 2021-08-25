package string;

public class VowelsConsonants {
	public static void main(String[] args) {

		String str = new String("Java by kiran");
		System.out.println(str);
		System.out.println("Given string contains following Vowels: ");

		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u' ||
					str.charAt(i) == 'A' || str.charAt(i) =='E' || str.charAt(i) =='I' || str.charAt(i) =='O' || str.charAt(i) =='U') {
				System.out.print(str.charAt(i) + " ");
			}
		}
	
		System.out.println("\n Given string contains following Consonents: ");
		for(int j=0; j<str.length(); j++) {
			if(str.charAt(j) != 'a' && str.charAt(j) !='e' && str.charAt(j)!='j' && str.charAt(j)!='o' && str.charAt(j) !='u' &&
					str.charAt(j) != 'A' && str.charAt(j) !='E' && str.charAt(j) !='j' && str.charAt(j) !='O' && str.charAt(j) !='U') {
				System.out.print(str.charAt(j) + " ");
			}
		}
	}

}
