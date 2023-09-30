package accentureQ;

public class SimplePermutation {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(permutation(str));
    }

    static int permutation(String str){
            int res = 1;
        for (int i = str.length(); i > 0; i--) {
            res *=i;
        }
        return res;
    }
}
