package InterviewProblems;

import java.util.HashMap;
import java.util.HashSet;

public class LongestUniqueSubString {

    public static void main(String[] args) {
        String a = " adwwcdwvdfwefvefvwfvwecafwe";
        System.out.println(bruteForce(a));
        System.out.println(optimized(a));

    }
    static int bruteForce(String a){

        int len = a.length();
        int maxlength = 0;

        for(int i=0; i<len; i++){
            HashSet<Character> Hs = new HashSet<>();
            for (int j=i; j<len;j++){

                if(Hs.contains(a.charAt(j))){
                    break;
                }
                Hs.add(a.charAt(j));
                maxlength = Math.max(maxlength,Hs.size());
            }
        }
        return maxlength;
    }

    static int optimized(String a){

        HashMap<Character,Integer> Hm = new HashMap<>();
        int len = a.length();
        int maxlength = 0;
        int i=0;

        for(int j=0; j<len; j++){

            if(Hm.containsKey(a.charAt(j)) && Hm.get(a.charAt(j)) >= i){

                i = Hm.get(a.charAt(j)) +1;
            }
            Hm.put(a.charAt(j),j);

            maxlength = Math.max(maxlength,j-i+1);

        }
        return maxlength;

    }

}
