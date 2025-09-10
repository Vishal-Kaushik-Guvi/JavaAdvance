import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Amit");
        set.add("Riya");
        set.add("Suresh");
        set.add("Meena");
        set.add("Amit"); // duplicate (ignored)
        set.add(null);   // only one null allowed

        System.out.println();
        System.out.println("Initial HashSet: " + set);

        System.out.println("Contains 'Riya'? " + set.contains("Riya"));
        System.out.println("Contains 'Raj'? " + set.contains("Raj"));

        set.remove("Suresh");
        System.out.println("After removing 'Suresh': " + set);

        System.out.println("Size of HashSet: " + set.size());
        System.out.println("Is HashSet empty? " + set.isEmpty());

        System.out.print("Iterating using Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        HashSet<String> another = new HashSet<>();
        another.add("Amit");
        another.add("Raj");

        set.addAll(another);
        System.out.println("After addAll: " + set);

        set.retainAll(another);
        System.out.println("After retainAll (intersection): " + set);

        set.removeAll(another);
        System.out.println("After removeAll: " + set);

        set.clear();
        System.out.println("After clear: " + set);
    }
}
