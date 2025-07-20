import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        // Test add
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("After add: " + Arrays.toString(list.toArray()));

        // Test get
        System.out.println("Element at index 1: " + list.get(1));

        // Test remove
        list.remove(1);
        System.out.println("After remove at index 1: " + Arrays.toString(list.toArray()));

        // Test add at index
        list.add(1, 5);
        System.out.println("After add at index 1: " + Arrays.toString(list.toArray()));

        // Test size
        System.out.println("Size: " + list.size());

        // Test iterator
        System.out.print("Iterator: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}