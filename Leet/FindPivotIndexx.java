// Not done by me
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int ele : nums)
            totalSum += ele;
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            if (leftsum * 2 == totalSum - nums[i])
                return i;       // Return the pivot index...
        return -1;
    }
}
