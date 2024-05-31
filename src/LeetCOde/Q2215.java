package LeetCOde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q2215 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hashset = new HashSet<>();
        HashSet<Integer> hashset2 = new HashSet<>();
        List<List<Integer>> lists = new ArrayList<>();

        for (int i : nums1) {
            hashset.add(i);
        }
        for (int i : nums2) {
            hashset2.add(i);
        }

        List<Integer> lst1 = new ArrayList<>(hashset);
        List<Integer> lst2 = new ArrayList<>(hashset2);
        lst1.removeAll(hashset2);
        lst2.removeAll(hashset);
        lists.add(lst1);
        lists.add(lst2);

        return lists;
    }
}
