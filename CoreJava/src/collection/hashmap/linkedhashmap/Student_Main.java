package collection.hashmap.linkedhashmap;
import java.util.LinkedHashMap;

import collection.hashmap.Student;

public class Student_Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(45, "abhi", 89);
		Student s2 = new Student(56, "nishi", 89);
		Student s3 = new Student(98, "viru", 89);
		Student s4 = new Student(254, "adi", 89);
		Student s5 = new Student(25, "sam", 89);

		System.out.println("=========LinkedHashMap============");
		LinkedHashMap<Integer, Student> lhm = new LinkedHashMap<Integer, Student>();
		lhm.put(101, s1);
		lhm.put(115, s2);
		lhm.put(109, s3);
		lhm.put(145, s4);
		lhm.put(129, s5);

		lhm.forEach((k,v) -> System.out.println(k + " " + v));		//print key values, lambda


	}

}
