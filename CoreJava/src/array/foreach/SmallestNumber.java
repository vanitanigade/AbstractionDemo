package array.foreach;

public class SmallestNumber {

	public static void main(String[] args) {

		int marks[] = {45,36,15,78,14,98};
		
		int minSoFar = marks[0];
		
		for(int num : marks) {
			if(num<minSoFar)
				minSoFar = num; 
		}
		System.out.println(minSoFar);
	}

}
