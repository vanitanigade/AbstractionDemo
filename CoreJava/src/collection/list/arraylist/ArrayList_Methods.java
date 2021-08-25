package collection.list.arraylist;

import java.util.ArrayList;

public class ArrayList_Methods {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Good Morning");
		al.add("Good Evening");

		System.out.println(al);		//OR
		for(String s : al) 
			System.out.println(s);
		System.out.println("==========");

		al.add(1, "Good afternoon");
		for(String s : al) 
			System.out.println(s);
		System.out.println("===========");

		System.out.println(al);  
		System.out.println("Arraylist size: " + al.size());	
		al.remove(0);
		al.remove("Good afternoon");
		for(String s : al)
			System.out.println(s);
		System.out.println("====after clear=====");
		al.clear();

	}

}
