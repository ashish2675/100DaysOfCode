//nt
class Solution {
    public int minMoves(int[] nums) {
         int mn=nums[0];
         int rs=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]<mn)
           mn=nums[i];   
        }
       
         for(int i=0;i<nums.length;i++)
         {
         rs+=nums[i]-mn;   
        }
        return rs;
    }
}
