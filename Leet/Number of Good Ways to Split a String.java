//nt
class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length() ; i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<s.length() ; i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>0){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                   map.remove(s.charAt(i));
                }                
                set.add(s.charAt(i));
                if(set.size()==map.size()){
                    ans++;
                }
            }
        }
        return ans;
    }
}
