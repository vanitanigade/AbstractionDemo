package array.twodimensional;

public class BackwardDiagonalElements {
	
	public static void main(String[] args) {
		//3x3
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i+j==2)
				System.out.print(a[i][j] + " ");	
			}
			System.out.println();
		}
	}

}	/*		  j[0][1][2]	i j
			i[0]1  2  3		2 0	 -> 2+0=2
			i[1]4  5  6		1 1	 -> 1+1=2
			i[2]7  8  9		0 2  -> 0+2=2
*/