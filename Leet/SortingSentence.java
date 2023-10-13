class Solution {
    public String sortSentence(String s) {
        String[] str = new String[s.split(" ").length];
        for(String st : s.split(" "))
        {
            str[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
        }
        return String.join(" ",str);
    }
}
