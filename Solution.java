package patterns;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {10,50,100,100,50,100,100,100};
        System.out.println(shipWithinDays(arr, 5));
    }


//
//class Solution {
    public static int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
        for(int i=0; i< weights.length; i++){
            if(weights[i]>max)max=weights[i];
            sum +=weights[i];
        }
        int high = sum;
        int low = max;
        int ans= 0;;
        while(low<high){
            int mid = low +(high - low)/2;
            if(func(mid,weights, days)){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }


    static boolean func(int mid, int[] arr, int days){
        int sum = 0;
        int D = 1;
        for(int i = 0; i<arr.length; i++){
            if(sum+arr[i]<=mid)sum +=arr[i];
            else{
                sum=arr[i];
                D++;
            }
        }
        if(D<=days)return true;
        return false;
    }
}
