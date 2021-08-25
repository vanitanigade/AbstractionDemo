package array.twodimensional;

public class PrintIndexOfElements {

	public static void main(String[] args) {
		//3x3
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
			System.out.print(i+ ","+j + "  ");	
			}
			System.out.println();
		}
	}

}
/*		  j[0][1][2]	i j
		i[0]1  2  3			 
		i[1]4  5  6			 
		i[2]7  8  9		  
*/