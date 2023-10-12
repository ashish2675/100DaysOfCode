class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length()-1;
        for(int i = num.length()-1; i>0; i--){
            if(num.charAt(i) != '0'){
                break;
            }
            n--;
        }
        return num.substring(0,n+1);
    }
}
