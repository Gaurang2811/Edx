package algorithmsAndDataStructures.basicAlgorithms;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
	private List<T> queue = new LinkedList<T>();

	public void push(T obj) {
		queue.add(obj);
	}

	public T pop() {
		if (!queue.isEmpty())
			return queue.remove(0);
		return null;
	}

	public T peek() {
		if (!queue.isEmpty())
			return queue.get(0);
		return null;
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.push(new Integer(1));
		queue.push(new Integer(3));
		queue.push(new Integer(5));
		queue.push(new Integer(7));
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
		queue.push(new Integer(13));
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}
}
