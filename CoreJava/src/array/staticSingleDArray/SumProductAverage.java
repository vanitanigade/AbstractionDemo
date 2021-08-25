package array.staticSingleDArray;

public class SumProductAverage {

	public static void main(String[] args) {

		int nums[]= {1,2,3,4,5};
		// result variables to store the values
		int sum=0, 
		product=1,   //multiplication
		average=0;	

		for(int i=0; i<5; i++) {			//adding the values
			sum = sum + nums[i];
		}
		System.out.println("sum of array element is "+sum);

		for(int i=0; i<5; i++) {
			product = product * nums[i];
		}
		System.out.println("product of array element is "+product);

		for(int i=0; i<5; i++) {
			average = average + nums[i];
		}
		System.out.println("Average of all elements is "+average/5);
	}

}
