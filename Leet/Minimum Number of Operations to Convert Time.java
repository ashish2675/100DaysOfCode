//nt
class Solution{
    public int convertTime(String current, String correct){
        int a = Integer.parseInt(current.substring(0, 2));
        int b = Integer.parseInt(current.substring(3));
        int x = a*60+b;
        int c = Integer.parseInt(correct.substring(0, 2));
        int d = Integer.parseInt(correct.substring(3));
        int y = c*60+d;
        int k = y-x;
        int ans = 0;
        while(k>0){
            if(k%60==0){
                k -= 60;
                ans++;
            }
            else if(k%15==0){
                k -= 15;
                ans++;
            }
            else if(k%5==0){
                k -= 5;
                ans++;
            }
            else if(k%1==0){
                k -= 1;
                ans++;
            }
        }
        return ans;
    }
}
