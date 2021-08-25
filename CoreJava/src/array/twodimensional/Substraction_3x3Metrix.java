package array.twodimensional;

public class Substraction_3x3Metrix {
	
	public static void main(String[] args) {

		int a[][] = {{1,3,4},{3,4,5},{1,2,3}};	//3D Array static initialization
		int b[][] = {{1,3,4},{3,4,5},{1,1,1}};
		
		int c[][] = new int[3][3]; //3x3//creating another matrix to store the addition of 3 metrices
		
												//addition and printing addition of 3 metrices
		for(int i=0; i<=2; i++) {				//no of rows
			for(int j=0; j<=2; j++) {			// no of columns
				
				c[i][j] = a[i][j] - b[i][j];		
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}


}
