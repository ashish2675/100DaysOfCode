class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] res = new int [nums1.length+nums2.length];

        for(int i = 0; i<nums1.length;i++){
            res[i] = nums1[i];
        }
        int j = nums1.length;
        for(int i = 0; i<nums2.length; i++){
            res[j] = nums2[i];
            j++;
        }

        Arrays.sort(res);

        int s = 0;
        int e = res.length-1;
        double sum = 0;
        int mid  = res.length/2;

        if(res.length % 2 == 0){
            
            sum += (double)(res[mid] + res [mid-1])/2;
        }else{
            
            sum += res[mid];
        }
        return sum;
    }
}

