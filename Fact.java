package accentureQ;

public class Fact {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    // By Recursion
    static int factorial(int n){
        if(n == 1) {
            return n;
        }
        return n*factorial(n-1);
    }
    // By Loop
    static int factorial2(int n) {
        int res = 1;
        for (int i = n; i > 0; i--) {
            res *= i;
        }
        return res;
    }
}
