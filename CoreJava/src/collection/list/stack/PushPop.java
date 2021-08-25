package collection.list.stack;

import java.util.Stack;

public class PushPop {

	public static void main(String[] args) {

		try {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Stack is: " + stack + "Empty");
		
		stack.push(11);
		System.out.println("Element 11 push to stack");
		System.out.println("Stack is: " + stack);
		
		stack.push(12);
		System.out.println("Element 12 push to stack");
		System.out.println("Stack is: " + stack);
		
		stack.push(25);
		System.out.println("Element 25 push to stack");
		System.out.println("Stack is: " + stack);
		System.out.println("top on stack: " + stack.peek());		//top element
		
		System.out.println("========================");
		int p = (Integer)stack.pop();
		System.out.println("element pop from stack: " + p);
		System.out.println("stack is : " + stack);
		
		int p1 = (Integer)stack.pop();
		System.out.println("element pop from stack: " + p1);
		System.out.println("stack is : " + stack);
		
		int p2 = (Integer)stack.pop();
		System.out.println("element pop from stack: " + p2);
		System.out.println("stack is : " + stack);
		
		stack.pop();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
