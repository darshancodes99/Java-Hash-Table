import java.util.HashMap;

public class LRU_IMplementation_DL {
    public static void main(String[] args) {
        DL dl = new DL();
        dl.insert(1);
        dl.insert(2);
        dl.insert(3);


        dl.insert(4);
        dl.insert(5);


        dl.insert(2);

        dl.search(5);

        dl.insert(1);
        dl.insert(4);
        dl.insert(3);

        dl.insert(7);
        dl.insert(1);
        dl.insert(5);

        dl.search(4);

        dl.insert(4);

        dl.search(4);
        dl.insert(1);
        dl.print();
    }
}

class DL {
    Node head;
    Node tail;
    int size = 0;
    int Dsize = 5;
    HashMap<Integer, Node> hashMap = new HashMap<>();

    public void insert(int value) {
        Node nn = new Node(value);
        if (head == null) {
            head = tail = nn;
            hashMap.put(value, head);
            size++;
        } else if (!hashMap.containsKey(value) && size == Dsize) {
            hashMap.remove(value, head);
            head = head.next;
            head.prev = null;
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
            hashMap.put(value, tail);
        } else if (hashMap.containsKey(value)) {
            Node get = hashMap.get(value);
            if (get == tail) {
                return;
            }
            if (get == head) {
                head = head.next;
                head.prev = null;
            } else {
                get.prev.next = get.next;
                get.next.prev = get.prev;
            }
            hashMap.remove(value, get);
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
            hashMap.put(value, tail);
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
            hashMap.put(value, tail);
            size++;
        }
    }

    public void search(int value) {
        if (!hashMap.containsKey(value)) {
            System.out.println("not present");
            return;
        }

        Node nn = new Node(value);
        Node get = hashMap.get(value);
        if (get == tail) {
            return;
        }
        if (get == head) {
            head = head.next;
            head.prev = null;
        } else {
            get.prev.next = get.next;
            get.next.prev = get.prev;
        }
        hashMap.remove(value, get);
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
        hashMap.put(value, tail);
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

}

class Node {
    Node prev;
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }

}
