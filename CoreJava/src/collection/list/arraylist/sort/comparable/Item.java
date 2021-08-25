package collection.list.arraylist.sort.comparable;

public class Item implements Comparable<Item>{
	
	long id;
	String name;
	String category;
	float price;
	
	Item(long id, String name, String category, float price){
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Item i) {
	//	return ((Long)this.id).compareTo(i.id);		//OR
	//	return this.name.compareTo(i.name);			//OR
	//	return this.category.compareTo(i.category);
		return ((Float)this.price).compareTo(i.price)*-1; 
		
		
	}
	
	
	

}
