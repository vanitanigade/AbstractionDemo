package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Vanita", 23));
		al.add(new Student(106, "Ajay", 26));
		al.add(new Student(105, "Jay", 21));
		
		System.out.println("===sorting by name===");
		Collections.sort(al, new NameComparator());
		for(Student st : al)
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		
		System.out.println("===sorting by rollno===");
		Collections.sort(al, new RollnoComparator());
		for(Student st : al)
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		
		System.out.println("===sorting by age===");
		Collections.sort(al, new AgeComparator());
		for(Student st : al)
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		
	}

}
