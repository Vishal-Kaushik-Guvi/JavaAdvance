import java.util.ArrayDeque;

public class ArrayDEqueueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);

        System.out.println();
        System.out.println("Deque after add: " + dq);

        dq.addFirst(5);
        dq.addLast(40);
        System.out.println("After addFirst and addLast: " + dq);

        dq.offer(50);
        dq.offerFirst(1);
        dq.offerLast(60);
        System.out.println("After offer methods: " + dq);

        System.out.println("Peek: " + dq.peek());
        System.out.println("PeekFirst: " + dq.peekFirst());
        System.out.println("PeekLast: " + dq.peekLast());

        System.out.println("Poll: " + dq.poll());
        System.out.println("PollFirst: " + dq.pollFirst());
        System.out.println("PollLast: " + dq.pollLast());
        System.out.println("Deque after poll operations: " + dq);

        System.out.println("Contains 20? " + dq.contains(20));
        System.out.println("Size: " + dq.size());

        dq.removeFirst();
        dq.removeLast();
        System.out.println("After removeFirst and removeLast: " + dq);

        dq.clear();
        System.out.println("Deque after clear: " + dq);
    }
}
