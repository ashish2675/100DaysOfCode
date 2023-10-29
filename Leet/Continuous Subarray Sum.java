//nt
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) return false;

        // Map to store remainder and its corresponding index
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);  // Initialize with a remainder of 0 at index -1
        int runningSum = 0;

        for (int i = 0; i < n; i++) {
            runningSum += nums[i];
            // If k is not zero, take modulo of running sum with k
            if (k != 0)
                runningSum %= k;
            // If the remainder is already in the map, check if the subarray has length >= 2

            if (remainderMap.containsKey(runningSum)) {
                int prevIndex = remainderMap.get(runningSum);

                // Check if the subarray has at least length 2
                if (i - prevIndex > 1)
                    return true;
            } else {
                // If the remainder is not in the map, add it along with its index
                remainderMap.put(runningSum, i);
            }
        }

        return false;
    }

}
