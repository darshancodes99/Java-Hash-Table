package LeetCOde;

import java.util.HashSet;

public class Q_2367 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(num - diff * 2))
                count++;
        }
        return count;
    }
}
