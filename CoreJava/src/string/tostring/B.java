package string.tostring;

public class B extends A{
	
	B(int id, String name){
		super(id, name);		//A(id, name)
	}

	
	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + "]";
	}

	

}
