import java.util.HashSet;

public class print_distint_element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 4, 5, 6, 5, 7, 8, 9, 7};
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i])) {
                duplicate.add(arr[i]);
            } else {
                hashSet.add(arr[i]);
            }
        }

        System.out.println(hashSet);

    }
}
