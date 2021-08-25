package array.staticSingleDArray;

public class AscendingOrDescOrder {

	public static void main(String[] args) {
		
			//static
				//[0]	1	2	3	4	
		int a[] = {10, 22, -7, 13, -50};
		
		for(int i=0; i<a.length; i++) {	//trigger
			
			//a[i]=10;
			for(int j=i+1; j<a.length; j++) {	//target area
				int temp;
				if(a[i] > a[j]) {		//for descending instead of > use <					
					temp=a[i];
					a[i] = a[j];		//swapping code
					a[j] = temp;
				}
								
			}
			
		}
		for(int t:a) {
			System.out.print(t + " ");
		}
	}

}
