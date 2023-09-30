package accentureQ;

public class StringMod {
    public static void main(String[] args) {
        String str ="1345";
        System.out.println(mod(str));
    }

    static int mod(String str){
        if(str.isEmpty()){
            return -1;
        }

        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - 48;
            num = (num * 10) +x;
        }
        int rem = num%11;
        return rem;
    }
}
