package array.staticSingleDArray;

public class MinNumber {

	public static void main(String[] args) {
		
		//static
		int a[] = {10, 22, -7, 13};
		int min=a[0];
		
		for(int i=0; i<a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		System.out.println(min);
		
	}

}
