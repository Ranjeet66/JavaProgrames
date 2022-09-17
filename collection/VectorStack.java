package collection;

import java.util.Stack;

public class VectorStack {

	public static void main(String[] args) {

//		Vector<Integer> v = new Vector();
//		v.add(34);
//		v.add(12);
		Stack<Integer> stack = new Stack();
		stack.push(12);
		stack.push(23);
		stack.push(34);
		int popped = stack.pop();
		System.out.println(popped);
		
		int  peeked = stack.peek();
		System.out.println(peeked);


	}

}
