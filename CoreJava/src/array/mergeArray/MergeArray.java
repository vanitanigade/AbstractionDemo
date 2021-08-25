package array.mergeArray;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int A[] = {10,20,30};
		int B[] = {40,50,60};
		int merge[] = new int[A.length + B.length];
		
		for(int i=0; i<A.length; i++) {
			
			merge[i] = A[i];				//{10,20,30} //merge[0] = A[0]		  
		}											 	 //merge[1] = A[1]
														 //merge[2] = A[2]
		for(int i=0; i<B.length; i++) {
			
			merge[i + A.length] = B[i];		//merge[0+3]=merge[3]=B[0]=40
		}											   //merge[4]=B[1]=50
													   //merge[5]=B[2]=60
		for(int i=0; i<merge.length; i++) {
			System.out.print(merge[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(merge));
	}

}
