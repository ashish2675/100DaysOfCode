class Solution {
    public int majorityElement(int[] nums){

    Arrays.sort(nums);
    int x = nums.length/2;
    return nums[x];
    }
}
