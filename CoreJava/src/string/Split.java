package string;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		
		String alpha = "a::b::c::d";
		
		String result1[] = alpha.split("::");  //splitting the string at "::" and storing the result in an array of strings
		System.out.println("Splitted string = " + Arrays.toString(result1));		//converting array to string
		
		String beta = "javaProgramming";
		String result2[] = beta.split("o");
		System.out.println("Splitted string = "+ Arrays.toString(result2));
		
		String delta = "Computer Engineering";
		String result3[] = delta.split("e");
		System.out.println(Arrays.toString(result3));
		
	}
	

}
