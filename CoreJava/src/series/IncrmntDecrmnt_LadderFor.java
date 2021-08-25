package series;

public class IncrmntDecrmnt_LadderFor {

	public static void main(String[] args) {

		for(int i=1; i<=7; i++) {
			System.out.print(i + " ");
		}
		for(int j=6; j>=1; j--) {
			System.out.print(j + " ");
		}
		
		System.out.println("\n=======================");
		
		for(int i=1; i<=10000; i=i*10) {
			System.out.print(i + " ");
		}
		for(int j=1000; j>=1; j=j/10) {
			System.out.print(j + " ");
		}


	}

}


