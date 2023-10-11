class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
        return false;
      }
     int a = x;
        long rev = 0;
        while(a !=0){
            int digit = a%10;
            // int b = 1;
            rev = rev*10 + digit;
            a = a/10;
          }
        // if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        if(rev != x) {

        return false;
        }
        else{
          return true;
        }
    }
}
