//NT
class Solution {
    public int countTriples(int n) {
        int cnt = 0;

        for (int i = 3; i <= n; i++) {
            int a = 1;
            int b = 2;
            int c = i;

            while (a != c && b != c && a != b) {
                if (a * a + b * b == c * c) {
                    cnt += 2;
                    a++; b++;
                }
                if (a * a + b * b < c * c) b++;
                if (a * a + b * b > c * c) {
                    a++;
                    b--;
                }
            }
        }
        return cnt;
    }
}
