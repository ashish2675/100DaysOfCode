import java.io.PrintStream;

public class ChinenseRemainder {
    public ChinenseRemainder() {
    }

    static int findMinX(int[] num, int[] rem, int k) {
        int x = 12;

        while(true) {
            int j;
            for(j = 0; j < k && x % num[j] == rem[j]; ++j) {
            }

            if (j == k) {
                return x;
            }

            ++x;
        }
    }

    public static void main(String[] args) {
        int[] num = new int[]{3, 4, 5};
        int[] rem = new int[]{2, 3, 1};
        int k = num.length;
        PrintStream var10000 = System.out;
        int var10001 = findMinX(num, rem, k);
        var10000.println("x is " + var10001);
    }
}

