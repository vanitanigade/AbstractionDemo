package switch_case;

import java.util.Scanner;

public class SeasonalMonths {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int month = scanner.nextInt();

		switch(month) 
		{
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Summer season");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Rainy season");
			break;
		case 10:
		case 11:
		case 12:
		case 1:
			System.out.println("Winter Season");
			break;
		default: System.out.println("Invalid entry");
		}

	}

}
