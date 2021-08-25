package serilization.egwithinheritance;

public class Student extends Person{

	private String course;
	private float per;
	
	public Student(int id, String name, String dob, char gender) {
		super(id, name, dob, gender);
	}

	public Student(int id, String name, String dob, char gender, String course, float per) {
		super(id, name, dob, gender);
		this.course = course;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", per=" + per + super.toString() + "]";
	}
	
	
	
	
	
	

}
