//nt
class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int x : tasks) {
            numFreq.put(x, numFreq.getOrDefault(x, 0) + 1);
        }

        int rounds = 0;
        for (int freq : numFreq.values()) {
            if(freq < 2) return -1; // Can't divide
            rounds += freq / 3;
            if(freq % 3 != 0) rounds++;
        }

        return rounds;
    }
}
