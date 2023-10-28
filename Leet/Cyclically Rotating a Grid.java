//nt
class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {


        int top=0;
        int buttom=grid.length-1;
        int left=0;
        int right=grid[0].length-1;

        while(top<buttom && left<right){

            int arr[] = new int[2*(buttom-left+1)+2*(right-left-1)];
            int idx=0;
            //left column towards top->buttom
            for(int y=top ; y<buttom ; y++) arr[idx++] = grid[y][left];

            //buttom row towards left -> right
            for(int x=left ; x<right ; x++) arr[idx++]=grid[buttom][x];

            //right column towards buttom-> top
            for(int x=buttom ; x>top ; x--) arr[idx++]=grid[x][right];

            //top row towards right->left
            for(int y=right ; y>left ; y--) arr[idx++]=grid[top][y];

            idx=arr.length-k%(arr.length);
            //start refilling grid
            //left column towards top->buttom
            for(int y=top ; y<buttom ; y++)  grid[y][left]=arr[idx++ % arr.length];

            //buttom row towards left -> right
            for(int x=left ; x<right ; x++) grid[buttom][x]=arr[idx++ % arr.length];

            //right column towards buttom-> top
            for(int x=buttom ; x>top ; x--) grid[x][right]=arr[idx++ % arr.length];

            //top row towards right->left
            for(int y=right ; y>left ; y--) grid[top][y]=arr[idx++ % arr.length];

            top++;
            buttom--;
            left++;
            right--;
        }

        

        return grid;
        
    }
}
