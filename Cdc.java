package accentureQ;

import java.util.Scanner;

public class Cdc {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Input length of array");
        int n = sc.nextInt();
        int sub = Integer.MIN_VALUE;
        int [] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] < arr[j]){
                    if (j - i > sub) sub = j - i ;
                }
            }

        }
        System.out.println("Maximum difference is " + sub);
    }
}
