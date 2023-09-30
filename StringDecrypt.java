package accentureQ;

public class StringDecrypt {
    public static void main(String[] args) {
        String str = "a2b2c2d1";
        int n = 5;
        System.out.println(decrypt(str,n));
//        char a ='2';
//        System.out.println(a - '0');
    }
    
    static String decrypt(String str, int n){
        int sum = 0;
        String ans = "";
        for (int i = 1; i <str.length() ; i +=2) {
            sum += str.charAt(i)-'0';
            if (sum>=n){
                ans +=str.charAt(i-1);
                return ans;
            }
        }
        return "-1";
    }
}
