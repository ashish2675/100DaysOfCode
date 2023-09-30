package easy;

import advJava.A;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
//        int []res = sum(nums);
        sum(A);
    }

    public static void sum(int[] arr) {
        if(arr.length<1)
            return;

        int [] nums = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            int x = arr[i] + arr[i+1];
            nums[i] =x;
        }
         sum(nums);
        System.out.println(Arrays.toString(arr));
    }
}
