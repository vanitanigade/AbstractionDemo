package array.staticSingleDArray;

public class Power {

	public static void main(String[] args) {

		int temp[] = {1,2,3,4,5};
		
		for(int i=0; i<temp.length; i++) {
			System.out.println("Square of " + temp[i] + " is "+ (int)Math.pow(temp[i], 2));
			System.out.println("Cube of " + temp[i] + " is " + (int)Math.pow(temp[i], 3));
		}
	



//	int a=2; 	System.out.println((int)Math.pow(a, 2));
		 //index
	// temp[0]=1 -> 1^2 =1
	// temp[1]=2 -> 2^2 =4			for cube 2^3=8
	// temp[2]=3 -> 3^2 =9
	// temp[3]=4 -> 4^2 =16
	// temp[4]=5 -> 5^2 =25
	
	}
}