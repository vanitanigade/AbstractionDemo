package array.copyarray;

public class Copy_array {

	public static void main(String[] args) {

		int array1[] = {2,3,4,5,6};
		int array2[] = new int[5];
		
		System.out.print("array1 = [");
		for(int i =0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("]");

		System.out.print("\ncopy array = [");
		
		for(int j=0; j<array1.length; j++) {
			System.out.print((array2[j] = array1[j]) + " ");
		}
		System.out.print("]");
	}

}
