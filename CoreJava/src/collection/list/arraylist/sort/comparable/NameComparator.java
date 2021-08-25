package collection.list.arraylist.sort.comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		//return ((Float)o1.price).compareTo(o2.price);
		return o1.name.compareTo(o2.name);
		
	}
	
	

}
