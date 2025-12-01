class Solution {
    private int[] memo;

    public int climbStairs(int n) {
        memo = new int[n + 1];
        return solveMemo(n);
    }

    private int solveMemo(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = solveMemo(n - 1) + solveMemo(n - 2);
        return memo[n];
    }
}
