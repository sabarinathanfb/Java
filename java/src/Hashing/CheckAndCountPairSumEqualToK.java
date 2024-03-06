package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class CheckAndCountPairSumEqualToK {
    public static void main(String[] args) {
        int[] A = {2,3,-5,15,7,8,18,-14,21,32,17,-5,6,5,-8,8,9,0};
        int k = 12;

        if(CheckPairSum(A,k)) System.out.println("A[i] + A[j] = k is True");
        else System.out.println("A[i] + A[j] = k is False");

        System.out.println(CountPairSum(A,k));
    }
    public static boolean CheckPairSum(int[] A,int k){

        //https://www.geeksforgeeks.org/problems/pair-sum-existence/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

        HashSet<Integer> Hm = new HashSet<>();

        for(int i =0; i<A.length; i++){
            int Target = k - A[i];

            if(Hm.contains(Target)){
                return true;
            }else{
                Hm.add(A[i]);
            }
        }

        return false;

    }
    public static int CountPairSum(int[] A, int k){

        // https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

        HashMap<Integer,Integer> Hm = new HashMap<>();
        int Ans = 0;
        for (int i=0; i<A.length; i++){
            int Target = k - A[i];

            if(Hm.containsKey(Target)){

                Ans += Hm.get(Target);
            }
            Hm.put(A[i], Hm.getOrDefault(A[i],0) +1);
        }
        return Ans;
    }
}
