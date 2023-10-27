//nt
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<arr.length; i++) map.put(arr[i],i);
        int min = arr.length;
//      Row-wise checking
        for(int i=0; i<mat.length; i++){
            int max = 0;
            for(int j=0; j<mat[0].length; j++){
                max = Math.max(max, map.get(mat[i][j]));
            }
            min = Math.min(min,max);
        }
//      Col-wise checking
        for(int i=0; i<mat[0].length; i++){
            int max = 0;
            for(int j=0; j<mat.length; j++){
                max = Math.max(max, map.get(mat[j][i]));
            }
            min = Math.min(min,max);
        }
        return min;
    }
}
