package array.twodimensional;

public class Multiplication_2x2Metrix {

	public static void main(String[] args) {

		int a[][] = {{1,2},{3,4}};
		int b[][] = {{1,1},{1,1}};
		
		int c[][] = new int[2][2];
		
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=1; j++) {
				
				c[i][j] = 0;
				
				for(int k=0; k<=1; k++) {		//a=a+2
					
					c[i][j] = c[i][j] + (a[i][k] * b[j][k]);
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		
	}

}
