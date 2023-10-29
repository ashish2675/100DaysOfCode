//nt
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean greater=false, less=false;
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            int d=nums[i+1]-nums[i];
            if (d>0) greater=true;
            else if (d<0) less=true;
            if (greater && less) return false;
        }
        return true;
    }
}
