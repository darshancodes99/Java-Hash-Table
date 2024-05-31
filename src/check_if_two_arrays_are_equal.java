import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class check_if_two_arrays_are_equal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        int[] arr2 = {1, 4, 3, 2, 4};

        if (arr.length != arr2.length) {
            System.out.println(false);
            return;
        }

        HashMap<Integer, Integer> hashMap;
        HashMap<Integer, Integer> hashMap2;

        hashMap = add(arr);
        hashMap2 = add(arr2);

        System.out.println(hashMap.equals(hashMap2));

        for (Map.Entry<Integer, Integer> me : hashMap.entrySet()){
            Integer key = me.getKey();
            Integer value = me.getValue();

            if (!hashMap2.containsKey(key)){
                System.out.println(false);
                return;
            }

            if (!value.equals(hashMap2.get(key))){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }

    public static HashMap add(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else {
                int fre = hashMap.get(i);
                hashMap.put(i, fre + 1);
            }
        }

        return hashMap;
    }
}
