package array.charArray;

public class CharArray {

	public static void main(String[] args) {
		
		char values[] = new char[4];
		
		values[0] = 'j';
		values[1] = 'a';
		values[2] = 'v';
		values[3] = 'a';
		
		for(char value : values) {
			System.out.print(value);
		}
		
		System.out.println();
		
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]);
		}
	}

}
