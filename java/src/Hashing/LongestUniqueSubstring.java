package Hashing;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String A = "abaabcdebjiabc";


        System.out.println(BruteForce(A));
        System.out.println(lengthOfLongestSubstring(A));
        System.out.println(UsingHashmap(A));
    }
    public static int BruteForce(String A){
        int max_length = 0;
        for(int i=0; i<A.length(); i++){
            HashSet<Character> Hs = new HashSet<>();
            for(int j=i;j<A.length(); j++){

                if(Hs.contains(A.charAt(j))){
                    break;
                }
                Hs.add(A.charAt(j));
                max_length = Math.max(max_length,j-i+1);


            }
        }
        return max_length;
    }

    public static int UsingHashmap(String s){

        HashMap<Character,Integer> Hm = new HashMap<>();
        int max_len = 0;
        int i=0;
        for (int j=0;j<s.length(); j++){

            char c = s.charAt(j);
            if(Hm.containsKey(c) && Hm.get(c) >= i){

                i = Hm.get(c) +1;

            }
            Hm.put(c, j);
            max_len = Math.max(max_len,j-i+1);

        }
        return max_len;
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int n = s.length();
        int maxLen = 0;
        int[] charIndex = new int[128]; // Assuming ASCII characters
        int i=0;
        for (int j = 0; j < n; j++) {
            i = Math.max(charIndex[s.charAt(j)], i);
            maxLen = Math.max(maxLen, j - i + 1);
            charIndex[s.charAt(j)] = j + 1;
        }

        return maxLen;
    }
}
