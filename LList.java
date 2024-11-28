import java.util.LinkedList;
import java.util.List;

public class LList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(3);


        System.out.println("Original list: " + list);

        int index = list.indexOf(7);
        if (index != -1) { 
            list.set(index, 6);
        }

        System.out.println("Updated list: " + list);
    }
}
