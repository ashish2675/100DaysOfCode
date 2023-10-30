//nt
class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>() ;
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < order.length(); j++){
            char o = order.charAt(j);
            if(map.containsKey(o)){
                int val = map.get(o);
                while(val > 0){
                    sb.append(o);
                    val--;
                }
                map.put(o,0);
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) > 0){
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
