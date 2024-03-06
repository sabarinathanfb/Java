package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckAndCountPairDifference {
    public static void main(String[] args) {
        int[] A = {1, 5, 4, 1, 2};
        int k=0;

        System.out.println(CountPairDifference(A,k));
        System.out.println(findPairs(A,k));

    }
    public static int findPairs(int[] nums, int k) {

        //https://leetcode.com/problems/k-diff-pairs-in-an-array/
        // Where k =0 And i !=j

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int result = 0;
        for (int i : map.keySet()) {
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1) {
                result++;
            }
        }

        return result;
    }
    public static int CountPairDifference(int[] A,int k){
        //https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
        // Where k is not Equal to 0

        HashMap<Integer,Integer> Hm = new HashMap<>();

        int Ans =0;

        for (int j : A) {

            if (Hm.containsKey(j - k)) {
                Ans += Hm.get(j - k);
            }
            if (Hm.containsKey(j + k)) {
                Ans += Hm.get(j + k);
            }

            Hm.put(j, Hm.getOrDefault(j, 0) + 1);
        }

        return  Ans;

    }
}
