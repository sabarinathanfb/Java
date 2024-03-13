package StringProblem;

import java.util.HashMap;

public class CreateNewStringUsingFrequency {
    public static void main(String[] args) {

        String S = "dwdwdwdwdad";

        HashMap<Character,Integer> Hm = new HashMap<>();

        String Ans = "";

        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);

            Hm.put(c,Hm.getOrDefault(c,0)+1);
        }

        for(char a: Hm.keySet()){
            int freq = Hm.get(a);
            Ans += a ;
            Ans += freq;
        }

        System.out.println(Ans);

    }
}
