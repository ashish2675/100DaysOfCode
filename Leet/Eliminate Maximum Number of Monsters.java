//nt
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        float[] arr = new float[dist.length];

        for(int i = 0; i < arr.length; i++)
            arr[i] = (float)dist[i]/(float)speed[i];

        Arrays.sort(arr);
        int count = 0;
        
        for(float i = 0; i < arr.length; i++){
            if(arr[(int)i]-i > 0)
                count++;
            else
                break;
        }
        
        return count;
    }
}
