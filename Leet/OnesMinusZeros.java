//nt
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int zero=0;
		int one=0;
		int col[]=new int[grid[0].length];
		int row[]=new int[grid.length];
		int ans[][]=new int[grid.length][grid[0].length];
		for(int i=0;i<grid.length;i++) {
			one=0;
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==1) one++;
			}
			row[i]=one;
		}
		
		for(int i=0;i<grid[0].length;i++) {
			one=0;
			for(int j=0;j<grid.length;j++) {
				if(grid[j][i]==1) one++;
			}
			col[i]=one;
		}
		for(int i=0;i<ans.length;i++) {
            one=0;
            zero=0;
			for(int j=0;j<ans[0].length;j++) {
				one=row[i]+col[j];
				zero=(ans.length-row[i])+(ans[0].length-col[j]);
				ans[i][j]=one-zero;
			}
		}
		return ans;
		
    }
}
