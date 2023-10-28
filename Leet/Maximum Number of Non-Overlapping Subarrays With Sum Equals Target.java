//nt
class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        HashSet<Integer>h=new HashSet<>();
        int c=0,s=0;
        h.add(0);
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            if(h.contains(s-target)==true)
            {
                c+=1;
                s=0;
                h.removeAll(h);
                h.add(0);
            }
            else h.add(s);
        }
        return c;
    }
}
