import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Most_frequent_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 3, 2, 1, 1, 1, 1, 5, 5, 4, 3, 8, 5, 8, 8, 8, 5};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int maxElement = 0;

        for (int i : arr) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else {
                int fre = hashMap.get(i);
                hashMap.put(i, fre + 1);
            }
        }

        for (Map.Entry<Integer, Integer> me : hashMap.entrySet()) {
            int value = me.getValue();
            if (value > max) {
                max = value;
                maxElement = me.getKey();
            }
        }

        System.out.println(maxElement);


    }
}
