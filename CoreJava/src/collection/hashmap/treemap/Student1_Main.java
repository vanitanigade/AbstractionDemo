package collection.hashmap.treemap;

import java.util.TreeMap;

public class Student1_Main {

	public static void main(String[] args) {
		Student1 s1 = new Student1(10, "abhi", 89.99f);
		Student1 s2 = new Student1(20, "nishi", 45);
		Student1 s3 = new Student1(30, "krish",69);
		Student1 s4 = new Student1(50, "shiv",25.88f);
		Student1 s5 = new Student1(40, "vish",50);
		
		TreeMap<Integer,Student1> tm = new TreeMap<Integer,Student1>();
		
		tm.put(1, s1);
		tm.put(17, s2);
		tm.put(33, s3);
		tm.put(5, s4);
		tm.put(6, s5);
		
		tm.forEach((k,v) -> System.out.println(k + " " + v));


	}

}
