package string.tostring;

public class A {
	
	int id;
	String name;
		
	A(){		// no argument constructor
	}
	
	A(int id, String name){
		this.id = id;
		this.name = name;
	}

	
	
	
	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
	
	

}
