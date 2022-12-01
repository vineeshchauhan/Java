import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDataStructure {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<>();

		deque.add("1");

		deque.addFirst("2");

		deque.addLast("1");

		deque.offer("3");

		deque.offerFirst("4");

		deque.offerLast("5");

		System.out.println(deque);

		System.out.println(deque.peek());

		// System.out.println(deque.peekFirst());
		// System.out.println(deque.peekLast());

		System.out.println(deque.poll());
		System.out.println(deque);

	}

}
