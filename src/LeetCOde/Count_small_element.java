package LeetCOde;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count_small_element {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] arr) {
        int[] newArr = new int[arr.length];
        int[] sortA = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortA);

        int last = -1;

        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < sortA.length; i++) {
            if (sortA[i] == last) {
                continue;
            } else {
                pairs.put(sortA[i], i);
                last = sortA[i];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = pairs.get(arr[i]);
        }

        return newArr;
    }
}
