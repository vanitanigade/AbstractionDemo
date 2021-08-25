package series;

public class MultipleOf4_Sum {

	public static void main(String[] args) {

		// find multiples of 4 between 5-50 and sum it

		int sum = 0;

		for(int i=5; i<=50; i++) {
			if(i%4==0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
