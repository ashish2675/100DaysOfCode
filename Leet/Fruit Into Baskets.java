//nt
class Solution {
    public int totalFruit(int[] tree) {
        int max = 0;
        int curMax = 0;
        int prev = -1;
        int prev2 = -1;
        int prevCount = 0;

        for (int fruit: tree) {
            if (fruit == prev || fruit == prev2) {
                curMax++;
            } else {
                max = Math.max(max, curMax);
                curMax = prevCount + 1;
            }
            if (fruit == prev) {
                prevCount++;
            } else {
                prevCount = 1;
                prev2 = prev;
                prev = fruit;
            }
        }
        return Math.max(max, curMax);
    }
}
