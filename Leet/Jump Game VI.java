//nt
class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            int best = Integer.MIN_VALUE;
            for (int j = Math.max(0, i - k); j < i; ++j)
                best = Math.max(best, nums[j] + nums[i]);
            nums[i] = best;
        }
        return nums[n-1];
    }
}
