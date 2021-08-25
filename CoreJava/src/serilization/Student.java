package serilization;

import java.io.Serializable;

public class Student implements Serializable {
	
	transient private long id;
	private String name;
	private String course;
	private float gradepoint;
	
	public Student(long id, String name, String course, float gradepoint) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.gradepoint = gradepoint;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", gradepoint=" + gradepoint + "]";
	}

	
	
	
	

}
