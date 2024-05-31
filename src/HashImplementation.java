import java.util.ArrayList;
import java.util.LinkedList;


class HashMap<K, V> {
    public class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public int n; // total nodes
    public int N; // length of buckets(array)
    public LinkedList<Node> buckets[];

    public HashMap() {
        this.N = 16;
        this.buckets = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    public int HashFunction(K key) {
        int bi = key.hashCode();
        return Math.abs(bi) % N;
    }

    public int searchLi(K key, int bi) {
        LinkedList<Node> ll = buckets[bi];
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key == key) {
                return i;
            }
        }

        return -1;
    }

    public void put(K key, V value) {
        int bi = HashFunction(key);
        int di = searchLi(key, bi);

        if (di == -1) {
            buckets[bi].add(new Node(key, value));
            n++;
        } else {
            Node node = buckets[bi].get(di);
            node.value = value;
        }

        double lambda = (double) n / N;
        if (lambda > 2.0) {
            reHash();
        }
    }

    public void reHash() {
        LinkedList<Node> oldBuckeyt[] = buckets;
        buckets = new LinkedList[N * 2];
        N = N * 2;

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < oldBuckeyt.length; i++) {
            LinkedList<Node> ll = oldBuckeyt[i];
            for (int j = 0; j < ll.size(); j++) {
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
    }

    public boolean containsKey(K key) {
        int bi = HashFunction(key);
        int di = searchLi(key, bi);

        if (di == -1) {
            return false;
        } else {
            return true;
        }
    }

    public V remove(K key) {
        int bi = HashFunction(key);
        int di = searchLi(key, bi);

        if (di == -1) {
            return null;
        } else {
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }
    }

    public V get(K key) {
        int bi = HashFunction(key);
        int di = searchLi(key, bi);

        if (di == -1) {
            return null;
        } else {
            Node node = buckets[bi].get(di);
            return node.value;
        }
    }

    public ArrayList<K> keySet() {
        ArrayList<K> keyset = new ArrayList<>();

        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Node> ll = buckets[i];
            for (int j = 0; j < ll.size(); j++) {
                Node node = ll.get(j);
                keyset.add(node.key);
            }
        }

        return keyset;
    }

    public boolean isEmpty() {
        return n == 0;
    }
}

public class HashImplementation {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "abc");
        hashMap.put(2, "abc");
        hashMap.put(3, "abc");
        hashMap.put(4, "abc");
        hashMap.put(5, "abc");
        hashMap.put(6, "abc"); hashMap.put(1, "abc");
        hashMap.put(7, "abc");
        hashMap.put(8, "abc");
        hashMap.put(9, "abc");
        hashMap.put(10, "abc");
        hashMap.put(11, "abc");
        hashMap.put(12, "abc");
        hashMap.put(12, "abc");
        hashMap.put(14, "abc");
        hashMap.put(15, "abc");
        hashMap.put(16, "abc");
        hashMap.put(17, "abc");
        hashMap.put(18, "abc");
        hashMap.put(19, "abc");
        hashMap.put(20, "abc");


        ArrayList<Integer> keyset = hashMap.keySet();
        System.out.println(keyset);

        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }
}