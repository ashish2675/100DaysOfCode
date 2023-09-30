package accentureQ;

import java.util.Scanner;

public class Plot {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int arr[] = new int [n];

        for (int i  = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            double sq = Math.sqrt(arr[i]);
            if (Math.pow(sq,2) == arr[i]){
//                System.out.println(arr[i]);
                 count++;
            }

        }
        System.out.println(count);
    }
}
