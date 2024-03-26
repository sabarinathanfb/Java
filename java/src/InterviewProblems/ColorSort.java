package InterviewProblems;

import java.util.Arrays;
import java.util.HashMap;

public class ColorSort {
    public static void main(String[] args) {
        int[] A = {2,0,2,1,1,0};

        int len = A.length;

        if(len<=1) return;

//        int[] freq_Array = new int[3];
//        int Start = 0;
//        while(Start < len){
//            freq_Array[A[Start++]]++;
//        }
//        int Index = 0;
//        for(int Color =0; Color<3; Color++){
//            while(freq_Array[Color] >0  && Index < len){
//                A[Index++] = Color;
//                freq_Array[Color]--;
//            }
//        }
        HashMap<Integer,Integer> Hm = new HashMap<>();
        for (int color : A) {

            Hm.put(color, Hm.getOrDefault(color, 0) + 1);

        }

        int Index = 0;
        for(int color=0; color<=2; color++){
            while(Hm.get(color)> 0 && Index < len){
                A[Index++] = color;
                Hm.put(color,Hm.getOrDefault(color,0) - 1);
            }

        }
        System.out.println(Arrays.toString(A));
    }
}

