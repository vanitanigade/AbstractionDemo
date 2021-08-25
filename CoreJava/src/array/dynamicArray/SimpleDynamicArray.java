package array.dynamicArray;

public class SimpleDynamicArray {
	
	public static void main(String[] args) {
		
	//	int b[] = {1,2,3,4,5};		//Static initialization
		int sum=0;
		int a[] = new int [10]; 	//declaration and instantiation  //dynamic initialization //length=10
		
		a[0]= 10;	//initialization till line no 16  a[9]=100
		a[1]= 20;
		a[2]= 30;
		a[3]= (-2+12)*4;
		a[4]= 50;
		a[9]= 100;
												// Printing array
		for(int i=0; i<a.length; i++) {			//length is the property of array
			System.out.print(a[i]+" ");
			sum = sum + a[i];
		}
		System.out.println("\n" + sum);
		

	}

}
