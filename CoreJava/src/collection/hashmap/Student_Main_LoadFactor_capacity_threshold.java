package collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Student_Main_LoadFactor_capacity_threshold {

	public static void main(String[] args) {

		Student s1 = new Student(45, "abhi", 89);
		Student s2 = new Student(56, "nishi", 89);
		Student s3 = new Student(98, "viru", 89);
		Student s4 = new Student(254, "adi", 89);
		Student s5 = new Student(25, "sam", 89);

		HashMap<Integer, Student> hm = new HashMap<Integer, Student>(32, .50f);
		hm.put(1, s1);
		hm.put(17, s2);
		hm.put(33, s3);
		hm.put(5, s4);
		hm.put(6, s5);

		hm.forEach((k,v) -> System.out.println(k + " " + v));		//print key values, lambda
		
		hm.forEach((k,v) -> System.out.println(k.hashCode() + " " + v.hashCode()));		

		System.out.println("===========for each loop=========");
		Set<Map.Entry<Integer, Student>> entryset = hm.entrySet();	//print key values, for each loop
		for(Map.Entry<Integer, Student> tentry : entryset) {
			System.out.println(tentry.getKey() + "  " + tentry.getValue());
		}
		System.out.println("======keys==========");
		Set set = hm.keySet();		
		System.out.println(set);				//this will print only key elements and not objects
		
		set.forEach(s -> System.out.println(s)); //this will print keys i.e. objects  //OR
		
		Set<Integer> keys = hm.keySet();			//print keys i.e. objects
		for(Integer k:keys) {
			System.out.println(k);
		}
		System.out.println("=========values==========");
		Collection<Student> valueSet = hm.values();		//print values
		for(Student s: valueSet) {
			System.out.println(s);			//OR
		}
		valueSet.forEach(p -> System.out.println(p));
		
	}

}
