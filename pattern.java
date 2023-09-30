package accentureQ;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        pattern(7);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 2; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = i; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1;j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

