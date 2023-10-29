//nt
class Solution {
    static int size;
    public static int calc(int idx,int arr[],int cap,int dp[][]){
        if(idx==size) return 0;
        if(dp[idx][cap]!=-1) return dp[idx][cap];
        // we can take it or not
        int ignore=calc(idx+1,arr,cap,dp); // if cap=1 then past diff is pos , if cap=0 then past diff would be negative
        int check=0;
        int diff=arr[idx]-arr[idx-1];
        if((diff<0 && cap==1) || (diff>0 && cap==0) || (cap==2 && diff!=0)){
            if(diff>0) check=1+calc(idx+1,arr,1,dp);
            else check=1+calc(idx+1,arr,0,dp);
        }
        return dp[idx][cap]=Math.max(check,ignore);
        }
    public int wiggleMaxLength(int[] arr) {
        if(arr.length==1) return 1;
        size=arr.length;
        int dp[][] = new int[size+1][3];
        for(int row[]:dp) Arrays.fill(row,-1);
        return calc(1,arr,2,dp)+1;
    }
}
