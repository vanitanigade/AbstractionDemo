package collection.comparator;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {

		if(s1.rollno == s2.rollno)
			return 0;
		else if(s1.rollno > s2.rollno)		//if < then output in descending order
			return 1;
		else 
			return -1;
	}

}
