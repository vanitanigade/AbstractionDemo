package array.twodimensional;

public class Addition_2x2Metrix {
	
	public static void main(String[] args) {

		int a[][] = {{1,2},{3,4}};	//2D Array static initialization
		int b[][] = {{1,1},{1,1}};
		
		int c[][] = new int[2][2]; //2x2 //creating another matrix to store the addition of 2 metrices
		
												//addition and printing addition of 2 metrices
		for(int i=0; i<=1; i++) {				//no of rows
			for(int j=0; j<=1; j++) {			// no of columns
				
				c[i][j] = a[i][j] + b[i][j];		// a[0][0] + b[0][0] = 1+1 = 2
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}			// a=	1 2			b= 1 1		a+b = 1+1	2+1		2	3
			//		3 4			   1 1			  3+1   4+1		4	5

