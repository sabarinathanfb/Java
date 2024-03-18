package Java_Basics;

import java.util.Arrays;

public class PrimeofErath {
    public static void main(String[] args) {

        int n =100;
        boolean[] isPrime =new boolean[n+1];

        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1]  = false;

        for(int i=2; i*i<=n; i++){

            if(isPrime[i] == true){

                for(int j =i*i; j<=n; j = j+i ){

                    isPrime[j] = false;
                }
            }

        }
        for (int i = 0; i < 100; i++) {
            if(isPrime[i]){
                System.out.print(i + " ");
            }

        }
    }
}
