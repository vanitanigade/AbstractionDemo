package series;
//e.g 153=1^3+5^3+3^3=1+125+27=153

public class Armstrong_DisplayNumbers {
	
	public static void main(String[] args) {

		int number, temp, total=0;

		for(int i=1; i<=1000; i++) {
			number = i;

			while(number!=0) {
				temp = number%10;
				total = total + (temp*temp*temp);
				number = number/10;
			}

			if(total==i) {
				System.out.print(i + " ");
		} 
			total=0;
		}
	}


}
