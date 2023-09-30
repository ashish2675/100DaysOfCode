package accentureQ;

import java.util.Scanner;

public class Maxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array");
        int n = sc.nextInt();
        int []arr=  new int[n];
        System.out.println("Input array");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maxElem(arr,n);
    }

    static void maxElem(int []arr, int  n){
        int max = 0;
        int index = 0;
        for (int i = 0; i<n; i++){
            if (arr[i]> max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
