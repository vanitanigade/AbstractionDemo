package array.staticSingleDArray;

public class NoGreaterNLessThan {

	public static void main(String[] args) {

		int a[] = {1,2,4,9,10,12,45,65,11};

		System.out.println("number greater than 10");
		for(int i=0; i<a.length; i++) {
			if(a[i] >10) 
				System.out.println(a[i]);
		}

		System.out.println("number less than 10");
		for(int i=0; i<a.length; i++) {
			if(a[i] <=10) 
				System.out.println(a[i]);
		}

	}

}
