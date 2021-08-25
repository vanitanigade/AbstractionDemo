package shalaka_intervew_ques;

public class NestedIf_LeapYear {

	public static void main(String[] args) {

		int year=2500;

		if(year !=0) {
			if((year%400==0) || (year%4==0 && year%100 !=0))
			{
				System.out.println(year +" is leap year");
			}else 
			{
				System.out.println(year +" is not leap year");
			} 
			}else 
			{
				System.out.println(year +" is not valid year");
			}
	}
}


