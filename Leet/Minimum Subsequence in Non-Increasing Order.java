//nt
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
    List<Integer> res = new ArrayList<>();
    var pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    pq.addAll(IntStream.of(nums).boxed().collect(Collectors.toList()));
    int sub_sum = 0, half_sum = IntStream.of(nums).sum() / 2;
    while (sub_sum <= half_sum) {
        res.add(pq.peek());
        sub_sum += pq.poll();
    }    
    return res;
}
}
