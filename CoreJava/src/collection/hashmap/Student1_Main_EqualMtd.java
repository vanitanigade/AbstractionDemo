package collection.hashmap;

import java.util.HashMap;

public class Student1_Main_EqualMtd {

	public static void main(String[] args) {

		HashMap<Student1,Student1> hm = new HashMap<Student1,Student1>();

		Student1 s1 = new Student1(25,"abhi",45.96f);
		Student1 s2 = new Student1(25,"abhi",45.97f);	// read comment in Student1 class to understand the difft per value
		if (s1==s2)	//== operator compares the two objects to see if they point to the same memory location.so not equal, irrespective of, values are equal or not
			System.out.println("both are equal");
		else 
			System.out.println("both are not equal");

		if(s1.equals(s2))						// . equals() method actually compares the two objects to see if they have the same object value.
			System.out.println("equal");
		else
			System.out.println("not equal");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		hm.put(s1, s1);
		hm.put(s2, s2);
		hm.forEach((k,v) -> System.out.println(k + " " + v)); //if s1 and s2 content is same then output will be only one row and 
	}															// if s1 and s2 content is different then output will be 2 rows of 2 objects

}
