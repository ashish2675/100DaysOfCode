//nt
class Solution {

    public String oddString(String[] words) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        int n = words.length;
        for(int i=0; i<n; i++){
            List<Integer> arr = new ArrayList<Integer>();
            for(int j=0; j<words[i].length()-1; j++){
                arr.add(words[i].charAt(j+1) - words[i].charAt(j));
            }
            // System.out.println(Arrays.toString(arr));
            Integer temp = map.getOrDefault(arr,0);
            map.put(arr,temp+1);
        }

        // System.out.println(map);
        List<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<List<Integer>, Integer> m : map.entrySet()){
            if(m.getValue() == 1)
                ans = m.getKey();
        }

        for(int i=0; i<n; i++){
            List<Integer> arr = new ArrayList<Integer>();
            for(int j=0; j<words[i].length()-1; j++){
                arr.add(words[i].charAt(j+1) - words[i].charAt(j));
            }
            // System.out.println(Arrays.toString(arr));
            if(arr.equals(ans)) return words[i];
        }

        System.out.println(ans);
        return "";
    }
}
