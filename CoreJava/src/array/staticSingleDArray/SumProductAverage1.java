package array.staticSingleDArray;

public class SumProductAverage1 {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};

		System.out.print("Current array is: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(+a[i]+" ");
		}
		System.out.println();

		int sum =0;
		int product =1;
		int average = 0;

		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
			product = product * a[i];
			average = sum/a.length;
		}
		System.out.println("sum of array element is: "+sum);
		System.out.println("product of array element is: "+product);
		System.out.println("average of array element is: "+average);



	}

}
