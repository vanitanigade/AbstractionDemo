package collection.hashmap;

import java.util.HashMap;

public class Hashcode {
	
public static void main(String[] args) {
	
	System.out.println("=======object class hashcode=======");
	Object obj = new Object();
	System.out.println(obj.hashCode());
	
	System.out.println("=======Integer class hashcode=======");
	Integer i1 = new Integer(1);
	System.out.println("i1 hashcode: " + i1.hashCode());
	
	Integer i2 = new Integer(2);
	System.out.println("i2 hashcode: " + i2.hashCode());
	
	Integer i3 = new Integer(3);
	System.out.println("i3 hashcode: " + i3.hashCode());
	
	Integer i4 = new Integer(15);
	System.out.println("i4 hashcode: " + i4.hashCode());
	
	Integer i5 = new Integer(16);
	System.out.println("i5 hashcode: " + i5.hashCode());

	HashMap<String, String> hm = new HashMap<String, String>();
	String s = new String("cts");
	System.out.println("s string key hashcode: "+ s.hashCode());
	System.out.println("s string key bucket: " + s.hashCode()%16);
	hm.put(s, "nidhi");
	
	String s1 = new String("infy");
	System.out.println("s1 string key hashcode: "+ s1.hashCode());
	System.out.println("s1 string key bucket: " + (float)s1.hashCode()%16);
	hm.put(s1, "abhi");
	
	String s2 = new String("wipro");
	System.out.println("s2 string key hashcode: "+ s2.hashCode());
	System.out.println("s2 string key bucket: " + s2.hashCode()%16);
	hm.put(s2, "prity");


	



	
}	
	
 
}
