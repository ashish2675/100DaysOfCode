//public class Solution {
//    public static void main(String[] args) {
//        System.out.println(reachNumber(5));
//    }
//    public static int reachNumber(int target) {
//        target = Math.abs(target);
//        int step = 0;
//        int sum = 0;
//        while (sum < target) {
//            step++;
//            sum += step;
//        }
//        while ((sum - target) % 2 != 0) {
//            step++;
//            sum += step;
//        }
//        return step;
//    }
//}



class Solution {
    public static void main(String[] args) {
    int[] arr = new int[]{1,3,5,6};
    int ans = searchInsert(arr, 7);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
        // int i=0;
        // int ans=0;
//        int ans=0;
        int start= 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}