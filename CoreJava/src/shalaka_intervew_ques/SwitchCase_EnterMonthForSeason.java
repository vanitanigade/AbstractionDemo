package shalaka_intervew_ques;

import java.util.Scanner;

public class SwitchCase_EnterMonthForSeason {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the month");
		String month = scanner.next();					
	//OR  String month ="Dec";

		switch(month){

		case "Feb":
		case "Mar":
		case "Apr":
		case "May":
			System.out.println("Summer Season");
			break;
		case "June":
		case "July":
		case "Aug":
		case "Sept":
			System.out.println("Rainy Season");
			break;
		case "Oct":
		case "Nov":
		case "Dec":
		case "Jan":
			System.out.println("Winter Season");
			break;
		default: System.out.println("Invalid month");

		}
	}

}
