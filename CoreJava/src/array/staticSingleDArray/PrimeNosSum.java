package array.staticSingleDArray;

public class PrimeNosSum {

	public static void main(String[] args) {

		int a[] = {10, 22, 7, 50, 13};		//7 13
		int sum=0;
		for(int i=0; i<a.length; i++) {

			//prime code

			int n=a[i];	//10,22,7,50,13
			int flag=0;

			for(int j=2; j<n; j++) {

				// 9%2,3..
				if(n%j==0) {
					flag=1;		//not prime
					break;
				}
			}

			if(flag==0)
				//System.out.println(a[i] + "");
				sum=sum+a[i];
		}
		System.out.println(sum);
	}


}
