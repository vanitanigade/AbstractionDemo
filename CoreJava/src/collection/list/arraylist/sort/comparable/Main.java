package collection.list.arraylist.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		Item i1 = new Item(90,"mac","foundation",101.50f);
		Item i2 = new Item(40,"lakhme","compact", 20);
		Item i3 = new Item(234,"revlon", "eyeliner", 954);
		Item i4 = new Item(5466,"oriflame","lipstic",500.99f);
		Item i5 = new Item(85,"loreal","nailpolish", 1150);
		
		ArrayList<Item> al = new ArrayList<Item>();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		al.add(i4);
		al.add(i5);
		
		System.out.println("=======sorted by price=========");
		Collections.sort(al);
		al.forEach(i -> System.out.println(i));
		
		System.out.println("=======sorted by name=========");
		Collections.sort(al, new NameComparator());
		al.forEach(i -> System.out.println(i));
		
		System.out.println("=======sorted by id=========");
		Collections.sort(al, new NameComparator());
		al.forEach(i -> System.out.println(i));
		
	}

}
