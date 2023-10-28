//nt
class Solution {

   static int dp[];

   // top down approach
   // T.C = O(n)
   // S.C = O(n+n) = O(n)

    static int helper(int arr[], int st){
        if(st>=arr.length) return 0;
        if(st==arr.length-1) return arr[arr.length-1];
        if(dp[st]!=-1) return dp[st];

        return dp[st] = Math.max(arr[st]+helper(arr,st+2),helper(arr,st+1));
    }

    // bottom up appraoch
    // T.C = O(n)
    // S.C = O(n)

    static int helper2(int arr[]){
        int n = arr.length;
        if(n==1) return arr[0];
        int dp[] = new int[n];
        dp[n-1] = arr[n-1];
        dp[n-2] = Math.max(arr[n-1],arr[n-2]);

        for(int i=n-3; i>=0; i--){
            dp[i] = Math.max(arr[i]+dp[i+2],dp[i+1]);
        }

        return dp[0];
    }

    // Without extra space
    // T.C = O(n)
    // S.C = O(1)

    static int helper3(int arr[]){
        int n = arr.length;
        if(n==1) return arr[0];
        
        int a = arr[n-1];
        int b = Math.max(arr[n-1],arr[n-2]);
        int c = b;

        for(int i=n-3; i>=0; i--){
            c = Math.max(arr[i]+a,b);
            a = b;
            b = c;
        }
        return c;
    }
    public int rob(int[] arr) {

        // int n = arr.length;
        // dp = new int[n];
        // Arrays.fill(dp,-1);
        return helper3(arr);
    }
}
