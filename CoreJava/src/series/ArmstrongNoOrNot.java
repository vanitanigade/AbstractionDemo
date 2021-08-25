package series;
//e.g 153=1^3+5^3+3^3=1+125+27=153

public class ArmstrongNoOrNot {
	
	public static void main(String[] args) {
		
		int num=153, number, temp, total=0;
		
		number = num;
		
		while(number!=0) {
			
			temp = number%10;
			total = total + (temp*temp*temp);
			number = number/10;
		}
		if(total==num)
			System.out.println(num + " is an armstrong number");
		else 
			System.out.println(num + " is not an armstrong number");
		
	}

}
