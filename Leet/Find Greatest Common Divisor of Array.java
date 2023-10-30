//nt
class Solution {
    public int findGCD(int[] nums) {
        int min=1001 , max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        for(int i=max; i>=2; i--){
            if(max%i==0 && min%i==0) return i;
        }
        return 1;
    }
}
