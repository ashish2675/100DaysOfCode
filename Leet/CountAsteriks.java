class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int bar = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '*' && bar ==0){
                count++;
            }else if(s.charAt(i) == '|' && bar == 0){
                bar++;
            }else if (s.charAt(i) == '|' && bar == 1){
                bar--;
            }
        }
        return count;
    }
}
