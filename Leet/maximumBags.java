//nt
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
      int temp[] = new int[capacity.length];
      long sum=0;
      for(int i=0;i<rocks.length;i++)
        {
            temp[i]=capacity[i]-rocks[i];
            sum=sum+(capacity[i]-rocks[i]);

        }  
        if(additionalRocks>=sum)
        return rocks.length;
        Arrays.sort(temp);
        for(int i=0;i<rocks.length;i++)
        {
            if(additionalRocks==0)
            {
                break;
            }
            if(temp[i]<=additionalRocks)
            {
                additionalRocks-=temp[i];
                temp[i]=0;
                
            }

        }
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==0)
            count++;
        }
        return count;
    }
}
