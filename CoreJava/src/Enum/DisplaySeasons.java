package Enum;

public class DisplaySeasons {
	
	public enum Season {WINTER, SPRING, SUMMER, FALL};	//defining enum inside the class

	
	public static void main(String[] args) {
		
		for(Season s : Season.values()) {			// traversing the enum
			System.out.println(s);
		}
	}

}
