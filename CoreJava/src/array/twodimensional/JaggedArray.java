package array.twodimensional;

public class JaggedArray {

	public static void main(String[] args) {
		// Jagged Array
		int a[][] = {{1,2,3,4}, {4,5}, {7,8,9,11,12,13}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
