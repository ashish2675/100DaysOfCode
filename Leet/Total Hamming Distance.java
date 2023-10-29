//nt
class Solution {
    public int totalHammingDistance(int[] nums) {
        int totalDist = 0;
        int n = nums.length;
        for (int i = 0; i < 32; i++) { 
            int count = 0;
            for (int j = 0; j < n; j++) { 
                count += (nums[j] >> i) & 1;
            }
            totalDist += count * (n - count); 
        }
        return totalDist;
    }
}
