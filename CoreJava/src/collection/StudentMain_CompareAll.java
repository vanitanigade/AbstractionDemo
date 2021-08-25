package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StudentMain_CompareAll {
	public static void main(String[] args) {

		Student s1 = new Student(10, "abhi");
		Student s2 = new Student(20, "nishi");
		Student s3 = new Student(30, "krish");
		Student s4 = new Student(50, "shiv");
		Student s5 = new Student(40, "vish");

		System.out.println("=======ArrayList========");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(null); al.add(null); al.add(s3); al.add(s4); al.add(s5);	//hs.add(null); hs.add(null); all null values will be displayed
		al.forEach(s -> System.out.println(s));

		System.out.println("=====HashSet=======");
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(null); hs.add(null); hs.add(s3); hs.add(s4); hs.add(s5);	//hs.add(null); hs.add(null); and print it - null will be displayed only once
		hs.forEach(s -> System.out.println(s));

		System.out.println("======LinkedHashSet======");
		LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
		lhs.add(null); lhs.add(null); lhs.add(s3); lhs.add(s4); lhs.add(s5);
		lhs.forEach(s -> System.out.println(s));

		System.out.println("=========TreeSet=======");
		TreeSet<Student> ts = new TreeSet();
		ts.add(s1); ts.add(s1); ts.add(s3); ts.add(s4); ts.add(s5);
		ts.forEach(s -> System.out.println(s));
		

		/*	System.out.println("======lambda======");
		hs.forEach(s ->{System.out.println(s);});       */

		System.out.println("========id>20=======");
		hs.forEach((Student s) -> {
			if(s.id > 20)
				System.out.println(s);
		});
	}

}
