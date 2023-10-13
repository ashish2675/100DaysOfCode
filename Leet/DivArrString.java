class Solution {
    public int[] divisibilityArray(String word, int m) {

        // int x = Integer.parseInt(word);
        long remainder = 0;
        int []res = new int [word.length()];
        for(int i = 0; i<word.length(); i++){

            int digit = word.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % m;
            if(remainder == 0){
                res[i] = 1;
            }
        }
       return res;
    }
}
