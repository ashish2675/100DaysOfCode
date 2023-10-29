// LeetCode Qno. 2009.
// URL - https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous

class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet();

        for(int num: nums)
            set.add(num);

        Integer[] uniqueNums = new Integer[set.size()];
        uniqueNums=set.toArray(uniqueNums);

        Arrays.sort(uniqueNums, (a, b)->(a-b));

        int end = 0;
        int max = Integer.MIN_VALUE;
        
        for(int start = 0; start< uniqueNums.length; start++){
            while(end <uniqueNums.length && uniqueNums[end]<uniqueNums[start]+len)
                end++;
            max = Math.max(max, end-start);
        }
        return len - max;
    }
}