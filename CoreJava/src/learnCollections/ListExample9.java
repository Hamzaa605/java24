package learnCollections;

import java.util.Stack;

public class ListExample9 {
public static void main(String[] args) {
	
	Stack<Integer> stack = new Stack<Integer>();
	System.out.println(stack.empty());
	
	stack.push(12);
	stack.push(14);
	stack.push(20);
	
	System.out.println(stack);
	System.out.println(stack.search(20));
	System.out.println("--------------------------------------------------------");
	
	System.out.println(stack.pop());
	System.out.println(stack);
	
	System.out.println(stack.pop());
	System.out.println(stack);
	
	System.out.println("--------------------------------------------------------");
	
	System.out.println(stack.peek());
	System.out.println(stack);
	
	System.out.println("--------------------------------------------------------");
	
	System.out.println(stack.empty());
	System.out.println(stack);
}
}
