package accentureQ;

import java.util.Arrays;

public class SmallLargeSum {
    public static void main(String[] args) {
        int arr[] = {6, 5, 7, 6, 8};
        System.out.println(sum(arr));
    }


    static int sum(int []arr){
        int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if(arr.length==0) return -1;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i]< small){
                small = arr[i];
            }
        }
        int sum = small+max;
        return sum;
    }
}
