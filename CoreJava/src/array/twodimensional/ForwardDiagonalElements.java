package array.twodimensional;

public class ForwardDiagonalElements {

	public static void main(String[] args) {
		//3x3
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==j)
				System.out.print(a[i][j] + " ");	
			}
			System.out.println();
		}

	}

}
