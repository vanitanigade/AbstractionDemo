package method;

public class JbkTutorial_Main {

	public static void main(String[] args) {
		//by creating object, both variables are printed
        JbkTutorial jt=new JbkTutorial(); 
        System.out.println(jt.a); 
        System.out.println(jt.b);
        
        jt.jbk();
        jt.kiran();
        
        int n = jt.add(5, 2);
        System.out.println(n);
	}

}
