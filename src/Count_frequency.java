import java.util.HashMap;
import java.util.Map;

public class Count_frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 1, 1, 0, 7, 2};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr){
            if (!hashMap.containsKey(i)){
                hashMap.put(i, 1);
            } else {
                int fre = hashMap.get(i);
                hashMap.put(i, fre + 1);
            }
        }

        for (Map.Entry me : hashMap.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
