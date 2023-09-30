import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

//        System.out.println(Arrays.toString(search(arr, 37)));
        System.out.println(bs(arr,37));
    }


//    static int[] search(int[][] matrix, int target){
//        int r = 0;
//        int c = matrix.length-1;
//
//        while (r< matrix.length && c>=0){
//            if(matrix[r][c] == target){
//                return new int[]{r ,c};
//            }
//            if (matrix[r][c] < target){
//                r++;
//            }else {
//                c--;
//            }
//        }
//        return new int[]{-1,-1};
//    }


    static int bs(int[][] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int row = arr.length;
        int col = arr[0].length-1;

        int start = 0;
        int end = (row*col)-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            int element = arr[mid/col][mid%col];

            if(element == target){
                return element;
            }
            if (element>target){
                end = mid-1;

            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
}
