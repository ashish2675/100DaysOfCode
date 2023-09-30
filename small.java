package accentureQ;

import java.util.Arrays;

public class small {
    public static void main(String[] args) {
//        int n =8;
        int []arr = {3,2,11,7,6,5,6,1};
//        int[] ans = smallerNo(arr);
//        System.out.println(Arrays.toString(ans));
        smallerNo(arr);
    }

    static void smallerNo(int[]arr){
        if(arr.length==0){
            return;
        }
        for(int i = 0; i<arr.length;i++){
            int minNo=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    minNo=arr[j];
                    break;
                }
            }
            arr[i]=minNo;

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
    static void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
