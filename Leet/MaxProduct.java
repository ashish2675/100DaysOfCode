//nt
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0];
        // negative multiple negative might be max
        for(int i=1; i<nums.length; i++){
            int temp =max;
            max = Math.max(Math.max(temp*nums[i], nums[i]*min), nums[i]);
            // overflow only happened when negative multiple
            // result cannot be overflow
            // then if negative multiple others already overflow
            // we can ignore the result after the overflow
            if(nums[i]>0 && Integer.MIN_VALUE/nums[i]>min) min = nums[i];
            else min = Math.min(Math.min(temp*nums[i], nums[i]*min), nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
