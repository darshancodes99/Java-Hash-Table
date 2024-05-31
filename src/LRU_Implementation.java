import java.util.Collections;
import java.util.LinkedList;

public class LRU_Implementation {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        insert(linkedList, 1);
        insert(linkedList, 2);
        insert(linkedList, 3);
        insert(linkedList, 4);
        insert(linkedList, 1);
        insert(linkedList, 4);
        insert(linkedList, 4);
        insert(linkedList, 4);
        insert(linkedList, 5);
        insert(linkedList, 3);
        insert(linkedList, 6);
        insert(linkedList, 3);

        search(linkedList, 6);
        search(linkedList, 1);
        search(linkedList, 7);

        System.out.println(linkedList);

    }

    public static void insert(LinkedList<Integer> linkedList, int value) {
        int size = 5;

        if (linkedList.size() < size && linkedList.contains(value)) {
            linkedList.removeAll(Collections.singleton(value));
            linkedList.addLast(value);
        } else if (linkedList.size() == size && linkedList.contains(value)) {
            linkedList.removeAll(Collections.singleton(value));
            linkedList.addLast(value);
        } else if (linkedList.size() == size && !linkedList.contains(value)) {
            linkedList.removeFirst();
            linkedList.addLast(value);
        } else {
            linkedList.addLast(value);
        }
    }

    public static void search(LinkedList<Integer> linkedList, int value) {
        if (!linkedList.contains(value)) {
            System.out.println("not present");
        } else {
            linkedList.removeAll(Collections.singleton(value));
            linkedList.addLast(value);
        }
    }


}
