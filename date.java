package accentureQ;

import java.util.Scanner;

public class date {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print(i+n + " ");
        }
    }
}
