package Java_Basics;

public class MaxNoOfZeros {
    public static void main(String[] args) {

        int[][] A = {{0,1,1},{0,0,1},{1,0,0}};

        int N = A.length;
        int Ans = 0;

        int i = 0; int j = N-1;

        while(i<N && j >=0){

            while(j>=0 && A[i][j] == 1){

                j--;
                Ans = i;
            }
            i++;
        }

        System.out.println(Ans);
    }
}
