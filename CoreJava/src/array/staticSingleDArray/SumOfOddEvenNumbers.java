package array.staticSingleDArray;

public class SumOfOddEvenNumbers {

	public static void main(String[] args) {

		int sumE=0,  sumO=0;
		
		int a[] = {1,2,3,4,5,6,7,8};
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0)
				sumE = sumE +a[i];				
			else
				sumO = sumO + a[i];
		}
		System.out.println("even elements of array "+ sumE);
		System.out.println("odd elements of array "+ sumO);

		
	}

}
