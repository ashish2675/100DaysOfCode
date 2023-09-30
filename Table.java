package accentureQ;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=10; i++){
            int res = n*i;
            sum += res;
            System.out.println(res);
        }
        System.out.println(sum);
    }
}
