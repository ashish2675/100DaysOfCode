//nt
class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0, lcm = 1;
        for(int i = 0; i < nums.length; i++) {
            lcm = 1;
            for(int j = i; j < nums.length; j++) {
                lcm = lcm(lcm, nums[j]);
                if(lcm == k) count++;
                else if(lcm > k) break;
            }
        }
        return count;
    }
    //calculate gcd of 2 numbers
    public static int gcd(int a, int b) {
        return a==0 ? b : gcd(b%a, a);
    }
    //calculate lcm of 2 numbers
    public static int lcm(int a, int b) {
        return (a*b) / gcd(a, b);
    }
}
