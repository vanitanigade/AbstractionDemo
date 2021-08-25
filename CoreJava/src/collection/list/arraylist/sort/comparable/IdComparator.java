package collection.list.arraylist.sort.comparable;

import java.util.Comparator;

public class IdComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		return ((Long)o1.id).compareTo(o2.id);
	//	return ((Float)o1.price).compareTo(o2.price);
	}

}
