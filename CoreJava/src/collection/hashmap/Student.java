package collection.hashmap;

public class Student {
	
	int id;
	String name;
	float per;
	
	public Student(int id, String name, float per){
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	

}
