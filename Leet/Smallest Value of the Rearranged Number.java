//nt
class Solution {
    public long smallestNumber(long num) {

        if(num==0){
            return 0;
        }

        long result=Math.abs(num);
        int freq[]=new int[10];
        

        while(result>0){
            int temp=(int)(result%10);
            freq[temp]++;
            result/=10;
        }

        if(num>0){

            int i=1;
            int count_zero=freq[0];

            while(freq[i]==0){
                i++;
            }

            result=(result*10)+i;
            freq[i]--;

            while(count_zero-->0){
                result=(result*10);
            }

            while(i<10){

                while(freq[i]>0){
                    result=(result*10)+i;
                    freq[i]--;
                }

                i++;

            }
        }else{

            int i=9;
        
            while(i>=0){

                while(freq[i]>0){
                    result=(result*10)+i;
                    freq[i]--;
                }

                i--;

            }
            result*=-1;

        }

        return result; 
        
    }
}
