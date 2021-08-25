package serilization.egwithinheritance;

import java.io.Serializable;

public class Person implements Serializable {
	
	private int id;
	private String name;
	transient private String dob;
	private char gender;
	
	public Person(int id, String name, String dob, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	

}
