//nt
class Solution {
    //method to count possible moving direction 
    public int findDir(String s,int i,int j,int n,int cnt){
        for(int k = 0;k < s.length();k ++) {
            char c = s.charAt(k);
            //All condition about the possible direction if yes count it or stop it
            if(c == 'L'){
                if(j - 1 >= 0) {
                    j = j - 1;
                    cnt++;
                }else break;
            }else if(c == 'R') {
                if(j + 1 < n) {
                    j = j + 1;
                    cnt++;
                }else break;
            }else if(c == 'D') {
                if(i + 1 < n) {
                    i = i + 1;
                    cnt++;
                }else break;
            }else{
                if(i - 1 >= 0) {
                    i = i - 1;
                    cnt++;
                }else break;    
            }

        }
        return cnt;
    }
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[][] grid = new int[n][n];
        int i = startPos[0];
        int j = startPos[1];
        int[]  ans = new int[s.length()];
        for(int k = 0;k < s.length();k ++) {
//we need to find from current to end possible direction 
//by sending substring of the current to end for reducing time complexity
            int countPossible = findDir(s.substring(k,s.length()),i,j,n,0);
            ans[k] = countPossible;
        }
        return ans;
    }
}
