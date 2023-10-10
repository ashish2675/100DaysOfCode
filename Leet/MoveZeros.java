class Solution {
    public void moveZeroes(int[] nums) {
        int NonZeroIndex = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, NonZeroIndex);
                NonZeroIndex++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
    public void swap(int []nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y]; 
        nums[y]= temp;
    }
}
