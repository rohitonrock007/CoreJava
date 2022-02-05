package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4);
		stack1.push(6);
		stack1.push(8);
		stack1.push(10);
		stack1.push(12);
		stack1.pop();
		stack1.push(13);
		
		System.out.println(stack1);
		System.out.println(stack1.peek());// to peek last element in the stack
		
	}

}
