// Not done
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int diff[] = new int[nums.length];
        Set<Integer> prefixSet = new HashSet();
        Set<Integer> suffixSet = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            prefixSet.clear();
            suffixSet.clear();
            for(int j = 0; j < nums.length; j++) {
                if(j <= i) {
                    if(!prefixSet.contains(nums[j])) {
                        prefixSet.add(nums[j]);
                    }
                }
                if(j > i) {
                    if(!suffixSet.contains(nums[j])) {
                        suffixSet.add(nums[j]);
                    }
                }
            }
            diff[i] = prefixSet.size() - suffixSet.size();
        }
        return diff;
    }
}
