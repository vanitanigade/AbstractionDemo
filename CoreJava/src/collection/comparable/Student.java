package collection.comparable;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {

		if(age == st.age)			//for String return s1.name.compareTo(s2.name);
			return 0;
		else if(age > st.age)		//if < then output in descending order
			return 1;
		else 
			return -1;
	}


}
