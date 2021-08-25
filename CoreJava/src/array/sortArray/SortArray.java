package array.sortArray;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int arr[] = {78,89,-89,0,324,25};
		Arrays.sort(arr);					//Utility class for array ->Arrays
		
		for(float i : arr) {				//user can take any data type of Integer
			System.out.println(i);
		}
		
		System.out.println("=============");
		
		Integer arr1[] = {78,89,-89,0,324,25};
		Arrays.sort(arr1);
		
		for(int i1 : arr1) {
			System.out.println(i1);
		}

		
	}

}
