package practice;

public class CallByValue {

	int data = 50;
	
	void change(int data) {
		this.data = data +100;
	}
	
	
	public static void main(String[] args) {

		CallByValue obj = new CallByValue();
		System.out.println("Before change "+ obj.data);
		
		obj.change(obj.data);
		System.out.println("After change1 " + obj.data);
		
		obj.change(500);
		System.out.println("After change2 " + obj.data);
		
		
	}

}
