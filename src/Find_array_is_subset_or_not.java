import java.util.HashSet;

public class Find_array_is_subset_or_not {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 1, 1, 0, 7};
        int[] sub = {1, 2, 3, 1, 1, 1, 7};

        HashSet<Integer> hashSet = new HashSet<>();
        for (int j : arr) {
            hashSet.add(j);
        }

        for (int j : sub) {
            if (!hashSet.contains(j)) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
