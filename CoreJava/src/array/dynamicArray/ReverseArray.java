package array.dynamicArray;

public class ReverseArray {

	public static void main(String[] args) {

		int a[] = new int [5]; 	//declaration and instantiation  //dynamic initialization //length=10
		
		a[0]= 10;	//initialization till line no 16  a[9]=100
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		
												// Printing array
		for(int i= a.length-1; i>=0; i--) {			//length is the property of array
			System.out.print(a[i]+" ");
		}

	}

}
