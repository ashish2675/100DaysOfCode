package accentureQ;

import java.util.Arrays;

public class Zero {
    public static void main(String[] args) {
        int [] arr = {0,1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println(Arrays.toString(zeroToEnd(arr)));
    }

    public static int[] zeroToEnd(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == 0){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
