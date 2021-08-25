package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorForLoopLambda {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Good Morning");
		al.add("Good Evening");
		al.add("Best Wishes");
		
		System.out.println(al);						// here only elements/values prints
		
		System.out.println("======Iterator=====");	// from here below prints objects
		Iterator<String>itr = al.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);					//OR
		//	System.out.println(itr.next());
		}
		
		System.out.println("===ListIterator====");
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String s = litr.next();
			System.out.println(s);
		}
		
		System.out.println("=====hasPrevious()=====");
		while(litr.hasPrevious()) {
			String s = litr.previous();
			System.out.println(s);
		}
		
		System.out.println("=======Enumeration=========");
		Enumeration<String> enm = Collections.enumeration(al);
		while(enm.hasMoreElements()) {
			String s = enm.nextElement();
			System.out.println(s);
		}
		
		System.out.println("=======EnhancedForLoop========");
		for(String s: al) {
			System.out.println(s);
		}
		
		System.out.println("======Lamda====");
		al.forEach(s -> System.out.println(s));
													//OR
		al.forEach(
				(String s)->{
			System.out.println(s);
		}
		);
		
		
	}

}
