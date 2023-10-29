//nt
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0 , high = numbers.length-1;

            while (low < high)
            {
                int complement = numbers[low] + numbers[high];
                if (complement == target)
                {
                    return new int[]{low+1 , high+1};
                }else if (complement > target){
                    high--;
                }else {
                    low++;
                }
            }
            
        return new int[] {-1 , -1};
    }
}
