package collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListOperations {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();		//Wrapper class
		al.add(35);	//Integer i=35  and int i=35 is not allowed
		al.add(89);
		al.add("java");
		al.add(85.45f);

		System.out.println(al);        //OR we can write as below
		
		for(Object obj : al) 
			System.out.println(obj);
		
		for(int i=0; i<10; i++) {			//i<=10 user can add any number like 100, 1000 etc
			al.add("hello");
		}										//OR we can write as below
		for(int i=0; i<5; i++) {
			al.add(new String("code"));
		}										//OR we can write as below
		for(int i=0; i<2;i++) {
			String s = new String("programme");
			al.add(s);
		}
		System.out.println(al);  
		System.out.println("Arraylist size: " + al.size());	
		
		int a[] = {1,2,3,4,5};
		System.out.println("Array length: " + a.length);
		
		String s = "Vanita";
		System.out.println("String length: " + s.length());
	}
}


