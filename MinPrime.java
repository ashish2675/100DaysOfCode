package accentureQ;

public class MinPrime {
    public static void main(String[] args) {
        int n = 350;
        System.out.println(minPr(n));
    }

    static int minPr(int n ){
        int min = 2;
        while(n>1){
            if(n % min == 0){
                break;
            }
            else {
                min++;
            }
        }
        return n-min;
    }
}
