package collection.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println(v.size());		//0
		System.out.println(v.capacity());	//10
		
		for(int i=1; i<=11; i++) {
			v.add(i * 5);
		}
		
		System.out.println(v.size());		//11
		System.out.println(v.capacity());	//20
		System.out.println("===========");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
