package collection.hashmap.treemap;

public class Student1{

	int id;
	String name;
	public float per;

	public Student1(int id, String name, float per){
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public boolean equals(Object obj) {
		Student1 t =(Student1)obj;
		if(this.id == t.id && this.name.equals(t.name) && this.per== t.per)
			return true;
		else
			return false;
	} 

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", per=" + per + "]";
	} 

	@Override
	public int hashCode() {
		return this.id;
		}
	}
