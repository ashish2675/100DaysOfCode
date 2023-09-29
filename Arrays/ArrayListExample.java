import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(69);
        list.add(34);
        list.add(654);
        list.add(123);
        list.add(865);
        list.add(698);

        System.out.println(list);
        System.out.println(list.contains(123));
        list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
