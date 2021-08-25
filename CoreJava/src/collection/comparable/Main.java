package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(101, "vanita", 23);
		Student s2 = new Student(106, "ajay", 27);
		Student s3 = new Student(105, "jay", 21);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		for(Student stu :al)
			System.out.println(stu.rollno + " " + stu.name + " " + stu.age);
	}

}
