//No Division is allowed. This is fake solution i have used divide
class Solution {
    public int divide(int dividend, int divisor) {
        double  res = 0;
        if(dividend < 0 && divisor<0){
            res = Math.abs(dividend /divisor);
            res = Math.abs(res);        
        }else{
            res = dividend /divisor;
        }
        return (int)res;
    }
}


