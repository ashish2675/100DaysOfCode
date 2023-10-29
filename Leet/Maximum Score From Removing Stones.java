//nt
public class Solution {
    public int maximumScore(int a, int b, int c) {
        int maximum = Math.max(a, Math.max(b, c));
        int minimum = Math.min(a, Math.min(b, c));
        int middle = a + b + c - maximum - minimum;

        if (minimum + middle < maximum) {
            return minimum + middle;
        }

        return (a + b + c) / 2;
    }
}
