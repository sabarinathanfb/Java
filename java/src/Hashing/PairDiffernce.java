package Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairDiffernce {
    public static void main(String[] args) {
        int[] arr = {10,20};
        int k = 10;

        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            // Check if the complement (target) exists OR if the current element itself is the complement of a previously seen element
            int target = num + k;
            if (seen.contains(target) || seen.contains(num - k)) {
                System.out.println(1);
            }
            seen.add(num);
        }
        System.out.println(0);
    }
}
