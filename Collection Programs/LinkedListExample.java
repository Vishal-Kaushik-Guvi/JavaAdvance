import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.addFirst(5);
        nums.addLast(40);

        System.out.println();

        System.out.println("Numbers: " + nums);

        nums.remove(2);
        nums.removeFirst();
        nums.removeLast();
        System.out.println("After removals: " + nums);

        System.out.println("First element: " + nums.getFirst());
        System.out.println("Last element: " + nums.getLast());

        nums.set(0, 99);
        System.out.println("After update: " + nums);

        LinkedList<String> names = new LinkedList<>();
        names.add("Amit");
        names.add("Riya");
        names.add("Suresh");

        System.out.println("Names: " + names);

        names.addFirst("Meena");
        names.addLast("Raj");
        System.out.println("After adding at ends: " + names);

        names.remove("Suresh");
        System.out.println("After removing Suresh: " + names);

        System.out.println("First name: " + names.getFirst());
        System.out.println("Last name: " + names.getLast());

    }
}
