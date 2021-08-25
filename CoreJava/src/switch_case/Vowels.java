package switch_case;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		char ch = scanner.next().charAt(0);

		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("given letter is a vowel");
			break;
		default:
			System.out.println("given letter is a consonant");
		}
		scanner.close();
	}

}
