//nt
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat.length;

        for(int i=0;i<n;i++){
            sum=sum+mat[i][i];
            if(i!=n-i-1){
                sum+=mat[i][n-i-1];
            }
        }return sum;
    }
}
