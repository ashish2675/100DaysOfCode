package accentureQ;

public class ChargedRod {
    public static void main(String[] args) {
        int []arr = {1, 3, };
        char[] str = {'P', 'N', 'P'};


        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (str[i] == 'P'){
                res += arr[i];
            }else{
                res -=arr[i];
            }
        }
        res = Math.abs(res*100);
        System.out.println(res);
    }
}
