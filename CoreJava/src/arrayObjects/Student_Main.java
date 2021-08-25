package arrayObjects;

public class Student_Main {

	public static void main(String[] args) {

		Student s1 = new Student(10, "Abhi");
		Student s2 = new Student(20, "Vanita");
		Student s3 = new Student(30, "Adi");
		Student s4 = new Student(40, "Manju");
		Student s5 = new Student(50, "Amit");
		
		Student s[] = new Student[5];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;
		
		for(Student sd : s)
			sd.display();
		                                 //OR use for loop
	/*	for(int i=0; i<s.length; i++) {
				s[i].display();
		} */
	}

}
