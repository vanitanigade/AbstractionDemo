package collection.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);			//if s1.name.compareTo(s2.name); then output in descending order
	}
	
	

}
