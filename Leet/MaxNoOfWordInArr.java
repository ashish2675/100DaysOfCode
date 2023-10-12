class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i =0; i< sentences.length; i++){
            String arr[] = sentences[i].split(" ");
            if (max<arr.length){
                max=arr.length;
            }
        }
        return max;
    }
}
