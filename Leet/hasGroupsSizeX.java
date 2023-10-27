//nt

class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<=1){
            return false;
        }
        int max=0;
        for(int i:deck){
            if(i>max){
                max=i;
            }
        }
        int[] a=new int[max+1];
        for(int i:deck){
            a[i]++;
        }
        int g=0;
        for(int i:a){
            if(i!=0)
            g=gcd(g,i);
        }
        return g>1;
    }
}
