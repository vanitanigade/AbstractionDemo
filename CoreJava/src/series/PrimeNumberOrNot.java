package series;
// a number that is divisible only by itself and 1

public class PrimeNumberOrNot {
	public static void main(String[] args) {

		int i, m=0, flag=0;
		int n=5;			//it is the number to be checked
		m=n/2; 		//5/2=2

		if(n==0 || n==1) {
			System.out.println(n+" is not prime number");
		}
		else 
		{
			for(i =2; i<=m; i++) 	//2<=2  //i=2 bcoz prime no starts from 2
			{
				if(n%i==0) 	//5%2=1 -> false
				{	System.out.println(n+" is not prime number");
				flag=1;
				break;
				}
			}
			if(flag==0)
				System.out.println(n+" is prime number");
		}
	} 
}
