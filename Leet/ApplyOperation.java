class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *=2;
                nums[i+1] = 0;
            }
        }
        int NonZeroIndex = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, NonZeroIndex);
                NonZeroIndex++;
            }
        }
        return nums;
    }
    public void swap(int []nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y]; 
        nums[y]= temp;
    }
}
