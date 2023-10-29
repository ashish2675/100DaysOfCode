//nt
class Solution {
    public int minAreaRect(int[][] points) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int i = 0; i<points.length; i++){
            if(!map.containsKey(points[i][0])){
                map.put(points[i][0], new HashSet<Integer>());
            }
            map.get(points[i][0]).add(points[i][1]);
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(points, (x,y)->x[0]-y[0]);
        for(int i = 0; i<points.length; i++){
            for(int j = i+1; j<points.length; j++){
                if(points[i][0]==points[j][0]||points[i][1]==points[j][1]){
                    continue;
                }
                int area = Math.abs(points[i][0]-points[j][0])*Math.abs(points[i][1]-points[j][1]);
                if(area<min&&map.get(points[i][0]).contains(points[j][1])&&map.get(points[j][0]).contains(points[i][1])){
                    min = area;
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }else{
            return min;
        }
    }
}
