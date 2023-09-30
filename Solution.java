package backtracking;
class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;


        if(s.length() == 1){
            count = 1;
        }

        for (int i = s.length()-1; i >=0; i--){

            if(s.charAt(i) != ' ' ){
                count++;
                if(i > 0 && s.charAt(i-1) == ' '){
                    break;
                }
            }


            // else if(s.charAt(i) == ' '){
            //     break;
            // }
        }
        return count;
    }
}