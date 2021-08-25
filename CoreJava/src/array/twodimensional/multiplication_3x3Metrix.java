package array.twodimensional;

public class multiplication_3x3Metrix {

	public static void main(String[] args) {

		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};	//3D Array static initialization
		int b[][] = {{1,1,1},{1,1,1},{1,1,1}};
		
		int c[][] = new int[3][3]; //3x3
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				
				c[i][j] = 0;
				
				for(int k=0; k<=2; k++) {		//a=a+2
					
					c[i][j] = c[i][j] + (a[i][k] * b[j][k]);
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
