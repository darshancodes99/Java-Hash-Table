import java.util.HashSet;

public class Print_all_unique_number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 3, 4, 5, 6, 7, 8, 6, 7};
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int k : arr) {
            if (hashSet.contains(k)) {
                duplicate.add(k);
            } else {
                hashSet.add(k);
            }
        }

        for (int j : arr) {
            if (!duplicate.contains(j)) {
                System.out.print(j + " ");
            }
        }
    }
}
