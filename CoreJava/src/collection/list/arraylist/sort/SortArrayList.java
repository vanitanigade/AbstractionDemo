package collection.list.arraylist.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	public static void main(String[] args) {
			
	Integer arr[] = {78,89,-89,0,324,25};
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(78);
	al.add(89);
	al.add(-89);
	al.add(0);
	al.add(324);
	al.add(25);

	Collections.sort(al);
	al.forEach(s -> System.out.println(s));
	
	}
}
