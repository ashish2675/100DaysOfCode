//nt
class Solution {
    private LinkedList<Integer> dryDays;

    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        dryDays = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) dryDays.add(i);
            else res[i] = -1;
        }
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) continue;
            if (tracker.containsKey(rains[i])) {
                int dryDay = findDryDay(tracker.get(rains[i]), i);
                if (dryDay == -1) {
                    return new int[0];
                }
                res[dryDay] = rains[i];
            }
            tracker.put(rains[i], i);
        }
        return res;
    }

    private int findDryDay(int prev, int current) {
        Iterator<Integer> iterator = dryDays.iterator();
        while (iterator.hasNext()) {
            int day = iterator.next();
            if (day < current && day > prev) {
                iterator.remove();
                return day;
            }
        }
        return -1;
    }
}
