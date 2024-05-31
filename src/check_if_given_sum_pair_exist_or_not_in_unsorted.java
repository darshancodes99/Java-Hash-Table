import java.util.HashMap;
import java.util.HashSet;

public class check_if_given_sum_pair_exist_or_not_in_unsorted {
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 4, 2, 5, 7, 8, 5, 2};
        int sum = 14;

        if (arr.length <= 1){
            System.out.println(false);
            return;
        }

        HashSet<Integer> hashset = new HashSet<>();
        for (int i : arr) {
            int find = sum - i;
            if (hashset.contains(find)) {
                System.out.println(true);
                return;
            }
            hashset.add(i);
        }

        System.out.println(false);
    }
}
