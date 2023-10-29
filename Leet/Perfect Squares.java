//nt
class Solution {
    public int numSquares(int n) {
        // Shortest path stuff is generally breadth first search
        // Since we go one step at a time, the most efficient one is usually bfs
        // BFS is generally about going level by level, one step at a time, so first answer is the quickest
        
        // We perform the DFS step but one step at a time and for all :) [Refer Down]      
        Queue<Integer> queue= new LinkedList<>();
        HashSet <Integer> visit= new HashSet<>(); // To remove duplicate values in queue
        if (n>0)
            queue.add(n);
        int count=0;
        
        while (!queue.isEmpty())
        {
            count++;
            // Level Order Traversal
            int size= queue.size();
            for (int j=1; j<=size; j++)
           {  
                int value= queue.poll();
                int div= (int)Math.sqrt(value);
                
                for (int i=1; i<= div; i++)
                {   
                    if ((value-i*i)==0)
                        return count;

                    else if(visit.add(value-i*i))
                        queue.add(value-i*i);
                }
           }
            
        }
        
        return count;
        
    }
}

/*
DFS Solution:

public int numSquares(int n) 
    {
        Integer dp[]= new Integer[n+1];
        return solver(n, dp);        
    }
    
    public int solver(int value, Integer dp[])
    {
        if (value<=0)
            return 0;
        
        if (dp[value]!=null)
            return dp[value];
        
        int count=0, max=Integer.MAX_VALUE;
        int div= (int)Math.sqrt(value);
        
        for (int i=1; i<= div; i++)
        {
          count= 1+ solver(value-i*i, dp);
          max= Math.min(max, count);
        }
        
        return dp[value]=max;
    }
*/
