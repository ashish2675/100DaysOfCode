//nt
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int row=score.length;
        int col=score[0].length;
       
        int arr[]=new int[row];
        int ind=0;
        for(int i=0;i<row;i++){
            h.put(score[i][k],i);
            arr[ind++]=score[i][k];
        }
        Arrays.sort(arr);
        int ind1=row-1;
        int ans[][]=new int[row][col];
        for(int i=0;i<row;i++){
             int j=h.get(arr[i]);
             ans[ind1--]=score[j];
        }
        return ans;
       
    }
}
