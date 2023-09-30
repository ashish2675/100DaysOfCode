package accentureQ;

import java.util.Scanner;

public class NearNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num");
        int num = sc.nextInt();
        System.out.println("m");
        int m = sc.nextInt();
        int diff = Integer.MAX_VALUE;
        int x = 0;
        int closestNum = 0;
        for (int i = 1; i < num / 2; i++) {
            x = m * i;
            int currDiff = Math.abs(num - x);
            if (currDiff <= diff) {
                diff = currDiff;
                closestNum = x;
            } else {
                break; // As the difference starts increasing beyond this point, no need to continue.
            }
        }
        System.out.println("Closest number divisible by m: " + closestNum);
    }
}
