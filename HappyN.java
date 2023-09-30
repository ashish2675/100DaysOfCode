package accentureQ;

import java.util.Scanner;

public class HappyN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        if(number(n) == true) System.out.println("Happy Number");
//        else System.out.println("Not a happy number");
        number(n);
    }

    static void number(int n ){
        int res = 0;
        while (n>0){
            res += Math.pow(n%10,2);
            n /= 10;

        }
        if(res == 4)System.out.println("Not a happy number");
        else if (res != 1){
            number(res);
        }

        if ( res == 1)System.out.println("Happy Number");
    }
}
