package collection.hashmap;

import java.util.HashMap;

public class Capacity_LoadFactor_Threshold {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "nishi");
		hm.put(2, "abhi");
		hm.put(3, "kiya");
		hm.put(4, "disha");
		hm.put(15, "mango");
		hm.put(16, "mango");		//Integer i=16;
		hm.put(17, "bingo");
		
		hm.forEach((k,v) -> System.out.println(k + " " + v));

	}

}
