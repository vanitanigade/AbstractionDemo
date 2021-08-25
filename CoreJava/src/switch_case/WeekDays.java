package switch_case;

import java.util.Scanner;

class WeekDays {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num= scanner.nextInt();
	
		switch(num) 
		{
		case 1: System.out.println("Sunday Weekend");
			break;
		case 2: 
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Weekday");
			break;
		case 7:
			System.out.println("WeekOff");
			break;
		default: System.out.println("invalid entry");
		
			
		}
		
	
	}

}
