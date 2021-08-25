package method;

public class MethodCalling_Addition_Main {
	
		public static void main(String[] args) {
			
			MethodCalling_Addition obj = new MethodCalling_Addition();
			int r = obj.add(10, 20);
			System.out.println(r);	//OR
			
			System.out.println(obj.add(2, 3));
			
			float sub = obj.Substraction(10.01f, 20.02f);
			System.out.println(sub);
;
			
		}
}


