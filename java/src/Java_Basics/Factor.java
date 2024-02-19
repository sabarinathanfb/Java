package Java_Basics;

public class Factor {
    public static void main(String[] args) {

        int n=30;
        for (int i = 2; i < n; i++) {

            if(fact(i) ==2){
                System.out.println(i+"is a prime");
            }else{
                System.out.println(i+ "not a prime");
            }

        }
    }
    static int fact(int n){

        int count =0;
        for(int i=1; i*i<=n; i++){

            if(n%i == 0){
                if(n/i == i){
                    count +=1;
                }else{
                    count +=2;
                }
            }

        }
        return count;
    }
}
