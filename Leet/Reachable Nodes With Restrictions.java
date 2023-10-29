//nt
class Solution {
        public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Set<Integer> seen = new HashSet<>();
        for (int r : restricted) {
            seen.add(r);
        }
        Map<Integer, Set<Integer>> g = new HashMap<>();
        for (int[] e : edges) {
            g.computeIfAbsent(e[0], s -> new HashSet<>()).add(e[1]);
            g.computeIfAbsent(e[1], s -> new HashSet<>()).add(e[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while (!q.isEmpty()) {
            int node = q.poll();
            seen.add(node);
            for (int kid : g.getOrDefault(node, Collections.emptySet())) {
                if (seen.add(kid)) {
                    q.offer(kid);
                }
            }
        }
        return seen.size() - restricted.length;
    }
}
