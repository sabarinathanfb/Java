package StringProblem;

import java.util.HashMap;

public class CreateNewStringUsingFrequency {
    public static void main(String[] args) {

        String S = "dwdwdwdwdad";
        HashMap<Character,Integer> Hm = new HashMap<>();
        StringBuilder Ans = new StringBuilder();
        int Start = 0;

        while(Start < S.length()){

            char c = S.charAt(Start);
            int freq = 0;
            while(Start < S.length() && S.charAt(Start) == c){
                Start++;
                freq++;
            }
            Ans.append(c);
            Ans.append(freq);
        }


        System.out.println(Ans);

    }
}
