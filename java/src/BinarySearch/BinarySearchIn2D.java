package BinarySearch;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] A = {{1,3,5},{10,11,16},{23,30,34}};
        int target = 3;

        if(searchMatrix(A,target)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        int n =matrix.length;
        int m = matrix[0].length;
        int Start =0; int End = n*m-1;
        while(Start <= End){
            int Mid = Start + (End - Start)/2;
            int Row = Mid/m; int Col = Mid%m;
            if(matrix[Row][Col] == target){
                return true;
            }else if(matrix[Row][Col] < target){
                Start = Mid +1;
            }else{
                End = Mid -1;
            }

        }

        return false;

    }
}
