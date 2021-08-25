package array.foreach;

public class LargestNumber {

	public static void main(String[] args) {

		int marks[] = {12, 45, 89, 67, 60};
		
		int maxSoFar = marks[0];
		
		for (int num : marks) {
			
			if (num > maxSoFar)
				maxSoFar = num;			
		}
		System.out.println("largest element is: " + maxSoFar);
	}

}
