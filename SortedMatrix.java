public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(binarySearch(arr, 6));
    }
    static int binarySearch(int[][] matrix, int target){
        if(matrix.length == 0) return -1;

        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0;
        int hi = (n * m) - 1;

        while(lo <= hi){
            int mid = (lo + (hi-lo)/2);
            if(matrix[mid/m][mid%m] == target){
                return matrix[mid/m][mid%m];
            }
            if(matrix[mid/m][mid%m] < target){
                lo = mid+1;
            }
            else {
                hi = mid +1;
            }
        }
        return -1;
    }
}
