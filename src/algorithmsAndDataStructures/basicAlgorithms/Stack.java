package algorithmsAndDataStructures.basicAlgorithms;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
	private List<T> stack = new LinkedList<T>();

	public void push(T obj) {
		stack.add(obj);
	}

	public T pop() {
		int currSize = stack.size();
		if (currSize > 0)
			return stack.remove(currSize - 1);
		return null;
	}

	public T peek() {
		int currSize = stack.size();
		if (currSize > 0)
			return stack.get(currSize - 1);
		return null;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(new Integer(1));
		stack.push(new Integer(3));
		stack.push(new Integer(5));
		stack.push(new Integer(7));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(new Integer(13));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}
}
