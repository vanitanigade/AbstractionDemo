package practice;

public class PassByValue {

	int x;
	
	PassByValue(){
		x=0;
	}
	
	PassByValue(int i){
		x=i;
	}
	
	public static void main(String[] args) {
		
		PassByValue obj = new PassByValue(5);
		System.out.println(obj.x);
		
		PassByValue obj1 = new PassByValue();
		System.out.println(obj1.x);
	}

}
