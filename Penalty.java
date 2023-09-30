package accentureQ;

import java.util.Arrays;

public class Penalty {
    public static void main(String[] args) {
        int []arr = new int[]{1, 3, 2};
        System.out.println(adjPenalty(arr));
    }

    static int adjPenalty(int[]arr){
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1;i<arr.length;i++){
            sum += Math.abs(arr[i] - arr[i-1]);

        }
        return sum;
    }

}
