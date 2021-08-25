package collection.list.arraylist.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import collection.hashmap.Student1;

public class Student1_Main {
	
	public static void main(String[] args) {
			
	Student1 s1 = new Student1(89,"abhi",45.96f);
	Student1 s2 = new Student1(25,"nishi",78);
	Student1 s3 = new Student1(75,"aru",88);
	Student1 s4 = new Student1(45,"samu",25.96f);	
	Student1 s5 = new Student1(95,"viki",56);
	
	ArrayList<Student1> al = new ArrayList<Student1>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	
	List<Student1> list = al.stream().filter(s->s.per>50).collect(Collectors.toList());
	list.forEach(s -> System.out.println(s));
	
	}

}
