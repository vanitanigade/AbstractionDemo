package series;

public class PrimeNosDisplay {

	public static void main(String[] args) {

		for(int i=2; i<50; i++) {

			//prime code

			int n=i;	//2,3,5,7,11,13,17,19,23,31
			int flag=0;

			for(int j=2; j<n; j++) {	//2,3,4,5,6..

				// 9%2,3..
				if(n%j==0) {
					flag=1;		//not prime
					break;
				}
			}

			if(flag==0)
				System.out.print(n + " ");
		}

	}

}
