import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        ArrayList <String> names = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        names.add("Vishal");
        names.add("Rahul");
        names.add("Aman");

        System.out.println();

        System.out.println("Initial Values: " +nums);
        System.out.println("Initial Values: " +names);

        System.out.println("Size of Nums: " +nums.size());
        System.out.println("Size of Names: " +names.size());

        nums.remove(2);
        nums.remove(0);

        names.remove(2);
        names.remove(0);

        nums.addLast(5);
        nums.addFirst(1);

        names.addFirst("Rohit");
        names.addLast("Randeep");

        System.out.println("After operations: "+nums);
        System.out.println("After operations: "+names);

        System.out.println("Integer at 1st Index before Operations: " +nums.get(1));
        System.out.println("Name at 1st Index before Operations: " +names.get(1));

    }
}
