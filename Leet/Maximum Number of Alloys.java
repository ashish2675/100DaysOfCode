//nt
class Solution {
   public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
    int maxNumberOfAlloys = 0;

    for (List<Integer> metals : composition) {
      int count = binarySearch(metals, stock, cost, budget);
      maxNumberOfAlloys = Math.max(maxNumberOfAlloys, count);
    }

    return maxNumberOfAlloys;
  }

  private int binarySearch(List<Integer> metals, List<Integer> stock, List<Integer> cost, int budget) {
    long left = 0, right = (int) 1e9, result = 0;

    while (left <= right) {
      long middle = left + (right - left) / 2;

      if (possible(middle, metals, stock, cost, budget)) {
        result = middle;
        left = middle + 1;
      }
      else
        right = middle - 1;
    }

    return (int) result;
  }

  private boolean possible(long count, List<Integer> metals, List<Integer> stock, List<Integer> cost, int budget) {
    long sum = 0;

    for (int i = 0; i < metals.size(); ++i) {
      sum += Math.max(0, count * metals.get(i) - stock.get(i)) * cost.get(i);

      if (sum > budget)
        return false;
    }

    return sum <= budget;
  }
}
