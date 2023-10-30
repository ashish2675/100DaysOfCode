//nt
class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        int l=h.length;
        Map<Integer,String> map=new HashMap();
        for(int i=0;i<l;i++)
            map.put(h[i],n[i]);
        Arrays.sort(h);
        String[] ans=new String[l];
        for(int i=l-1,j=0;i>=0;i--)
            ans[j++]=map.get(h[i]);
    return ans;
    }
}
