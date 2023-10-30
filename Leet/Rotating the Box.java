//nt
class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length,n=box[0].length;
        char ans[][]=new char[n][m];
        for(char c[]:ans)
        {
            Arrays.fill(c,'.');
        }
        int ind=m-1;
        for(int i=0;i<m;i++,ind--)
        {
            int j=n-1,k=j;
            while(j>=0 && k>=0)
            {
                if(box[i][j]=='*')
                {
                    ans[j][ind]='*';
                    k=j-1;
                }
                else if(box[i][j]=='#')
                {
                    ans[k][ind]='#';
                    k--;
                }
                j--;
            }
        }
        return ans;
    }
}
