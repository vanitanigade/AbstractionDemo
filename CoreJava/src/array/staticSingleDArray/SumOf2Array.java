package array.staticSingleDArray;

import java.util.Arrays;

public class SumOf2Array {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		
		int c[] = new int[5]; 		//instantiation of 3rd array to store results
		
		for(int i=0; i<5; i++) {
			
			c[i] = a[i] + b[i];
			
			System.out.print(c[i] + " ");
		}
		
	}

}
