package array.staticSingleDArray;

public class PrimeNosDisplay {

	public static void main(String[] args) {

		int a[] = {10, 22, 7, 50, 13};		//7 13

		for(int i=0; i<a.length; i++) {

			//prime code

			int n=a[i];	//10,22,7,50,13
			int flag=0;

			for(int j=2; j<n; j++) {	//2,3,4,5,6..

				// 9%2,3..
				if(n%j==0) {
					flag=1;		//not prime
					break;
				}
			}

			if(flag==0)
				System.out.println(a[i] + "");
		}
	}

}
