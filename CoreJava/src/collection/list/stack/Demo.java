package collection.list.stack;

import java.util.Stack;

public class Demo {

	public static void main(String[] args) {

		Stack stack = new Stack();
		System.out.println("stack: " + stack);
		stack.add(11);
		stack.add(12);
		stack.add(13);
		stack.add("om");
		stack.add("Raj");
		System.out.println("Stack: " + stack);
		for(Object s : stack) 
			System.out.println(s);
		
		System.out.println("after remove");
		stack.remove(1);
		stack.remove("om");
			
		for(Object s : stack) 
			System.out.println(s);
		
	}

}
