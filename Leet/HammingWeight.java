//nt
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;

        // TC => O(n) , where n is a binary string of length 32.
        while(n!=0){
            if((n&1)==1){
                ans++;
            }
            //n = n>>1;  //if use this you will get TLE Error 
			n = n>>>1;
        }
        return ans;
    }
}
