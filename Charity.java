package accentureQ;

public class Charity {
    public static void main(String[] args) {
        int n =3;
        int charity = 0;
        for (int i = 1; i <= n; i++) {
            charity += (int) Math.pow(i,2);
        }
        System.out.println(charity);
    }
}
