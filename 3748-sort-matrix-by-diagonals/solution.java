class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, PriorityQueue<Integer>> minMap = new HashMap<>();
        Map<Integer, PriorityQueue<Integer>> maxMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                if (i >= j) {
                    maxMap.computeIfAbsent(key, k -> new PriorityQueue<>((a, b) -> b - a)).add(grid[i][j]);
                } else {
                    minMap.computeIfAbsent(key, k -> new PriorityQueue<>()).add(grid[i][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                if (i >= j) {
                    grid[i][j] = maxMap.get(key).poll();
                } else {
                    grid[i][j] = minMap.get(key).poll();
                }
            }
        }
        return grid;
    }
}
