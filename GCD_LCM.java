package Math;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,2));
        System.out.println(lcm(9,18));

    }
// Euclidian method
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    // lcm
    static int lcm(int a, int b){
        return a*b /gcd(a,b);
    }
}
