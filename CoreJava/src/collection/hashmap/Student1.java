package collection.hashmap;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
//if id/name/per is not added in equal & hashcode method then create difft Student objects in main mtd & put difft id/name/per respectively 
//and both objects should go in one bucket of hashtable instead of multiple buckets

		@Override
	public boolean equals(Object obj) {
		Student1 t =(Student1)obj;
		if(this.id == t.id && this.name.equals(t.name) )	//&& this.per== t.per
			return true;
		else
			return false;
	}  

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

	
/*	@Override
	public int hashCode() {
		return this.id;
		} 
*/	
	}
