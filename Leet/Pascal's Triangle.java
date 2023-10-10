class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> v = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    v.add(1);
                } else {
                    List<Integer> prevRow = res.get(i - 1);
                    int newValue = prevRow.get(j - 1) + prevRow.get(j);
                    v.add(newValue);
                }
            }
            res.add(v);
        }
        return res;
    }
}
