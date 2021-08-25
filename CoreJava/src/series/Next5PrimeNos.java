package series;

public class Next5PrimeNos {
	
	public static void main(String[] args) {

		int no=7;		//--> next5  prime nos 11 13 17 19 23
		int count=0;
		
		for(int i=no+1; i<=i; i++) {	//8,9,10,11

			//prime code

			int n=i;	
			int flag=0;

			for(int j=2; j<n; j++) {	//2 3 4 5 6..

				// 9%2,3..
				if(n%j==0) {
					flag=1;		//not prime
					break;
				}
			}

			if(flag==0) {
				count++; 	//count=count+1;
				System.out.print(n + " ");	//11 13 17 19 23
				if(count==5)
				break;
			}
		}
	}




}
