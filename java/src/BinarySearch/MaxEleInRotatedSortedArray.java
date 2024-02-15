package BinarySearch;

public class MaxEleInRotatedSortedArray {
    public static void main(String[] args) {
        int[] A = {11,12,18,19,22,26,28,29,30,1,2,3,4,5,6,7};

        System.out.println(MaximumElement(A,0,A.length));

    }
    public static int MaximumElement(int[] A,int S,int E){

        while(S<E){

            int M = S + (E-S) /2;
            if(A[S] < A[M]){
                S = M;
            }else{
                E = M;
            }
        }
        return A[S];
    }
}
