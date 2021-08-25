package collection.list.linkedlist;

import java.util.*;

public class Comp_LinkedList_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(73);
		al.add(45); 
		al.add(84);
		al.add(1,222);
		al.add(4,56);
		al.remove(2);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();		//Wrapper class
		ll.add(23);
		ll.add(73);
		ll.add(45); 
		ll.add(84);
		ll.add(1,222);
		ll.add(4,56);
		ll.remove(2);
		
		System.out.println("=====content of an arraylist=====");
		al.forEach(s -> System.out.println(s));
				
		System.out.println("====content of an linkedlist=====");
		ll.forEach(s -> System.out.println(s));
	}
}
