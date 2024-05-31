import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Find_all_duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 4, 5, 6, 5, 7, 8, 9, 7};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else {
                int fre = hashMap.get(i);
                hashMap.put(i, fre + 1);
            }
        }

        for (Map.Entry<Integer, Integer> me : hashMap.entrySet()){
            int value = me.getValue();
            if (value > 1){
                System.out.println(me.getKey());
            }
        }
    }
}
