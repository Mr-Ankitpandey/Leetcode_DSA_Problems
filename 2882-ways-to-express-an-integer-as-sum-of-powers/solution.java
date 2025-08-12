class Solution {
    public int numberOfWays(int n, int x) {
        int mod = 1000000007;
        List<Integer> powers = new ArrayList<>();
        for (int i = 1; Math.pow(i, x) <= n; i++) {
            powers.add((int)Math.pow(i, x));
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int val : powers) {
            for (int s = n; s >= val; s--) {
                dp[s] = (dp[s] + dp[s - val]) % mod;
            }
        }
        return dp[n];
    }
}

