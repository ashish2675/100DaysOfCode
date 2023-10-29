//nt
class Solution {
    int mod= 1000000007;
    public int rev(int n){
        int x=0;
        while(n>0){
            x*=10;
            x+= (n%10);
            n/=10;
        }
        
        return x;
    }
    
    public int countNicePairs(int[] nums) {
        int n= nums.length;
        long bad=0;
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0; i<n; i++){
            int r= rev(nums[i]);
            if(!mp.containsKey(nums[i]-r)){
                mp.put(nums[i]-r,1);
            } else {
                mp.put(nums[i]-r, mp.get(nums[i]-r)+1);
                bad= (bad+ mp.get(nums[i]-r)-1)%mod;
            }
        }
        
        return (int)(bad%mod);
    }
}
