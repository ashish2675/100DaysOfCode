package accentureQ;

import java.util.Arrays;
import java.util.Scanner;

public class PosSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();
        System.out.println("Enter array");
//        int []arr = new int [] {1, 2, 3,7, 5};
        int []arr = new int [n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
//        int target = 12;
        int target = sc.nextInt();

        System.out.println(Arrays.toString( arr(arr, target)));

    }

    static int[] arr(int[]arr, int target){
        int sum =0;
        int []res = new int[2];
        int start = 0;

        int i =0;

        while ( i< arr.length){
            if(sum == target){
                res[0] = start + 1;
                res[1] = i ;
                break;
            }else if(sum<target){
                sum += arr[i];
                i++;
            } else if (sum != target) {
                start++;
                i = start;
                sum = 0;
            }
        }
        return res;
    }
}
