package serilization.egwithinheritance;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person(201, "abhi", "1st Jan", 'F');
		Person p2 = new Person(202, "kriti", "5th Jan", 'F');
		Person p3 = new Person(203, "sam", "15th Jan", 'M');
		
		ArrayList<Person> alp = new ArrayList<>();
		alp.add(p1);
		alp.add(p2);
		alp.add(p3);
		
		String fname = "xyz.txt";
		SerilizationDemo s = new SerilizationDemo();
		DeserilizationDemo ds = new DeserilizationDemo();
		s.writeToFile(fname, alp);
		ds.readFromFile(fname);
		
		Student s1 = new Student(301,"samu","1st Feb",'F',"ME",5.5f);
		Student s2 = new Student(302,"krish","4th Feb",'M',"ME",9.5f);		
		ArrayList<Student> als = new ArrayList<>();
		als.add(s1);
		als.add(s2);
		
		fname = "abc.txt";
		s.writeToFile(fname, als);
		ds.readFromFile(fname);

	}

}
