package patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {1, 3, 5, 2, 4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void sort(int [] arr, int start, int end){
        if(end==0){
            return;
        }
        if(start<end) {
            if (arr[start] > arr[start + 1]) {
              swap(arr, start, start+1);
            }
            sort(arr, start+1, end);
        }
        else{
            sort(arr,0,end-1);
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
