package Java_Basics;

public class StringReverse {
    public static void main(String[] args) {

        String S = "abcffdcba";

        int i=0;
        int E = S.length()-1;

        while(i<E){

            if(S.charAt(i) == S.charAt(E)){
                i++;
                E--;
            }else {
                System.out.println("false");
                break;
            }

        }
        System.out.println("true");

    }
}
