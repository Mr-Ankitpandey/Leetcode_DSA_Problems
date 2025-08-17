class Solution {
    public double new21Game(int n, int k, int maxPts) {
        // Edge case: if k == 0 or n >= k + maxPts, Alice always stops <= n
        if (k == 0 || n >= k + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;

        double windowSum = 1.0; // sum of last maxPts probabilities
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;

            if (i < k) {
                // If i < k, Alice may continue to draw, so add dp[i] into window
                windowSum += dp[i];
            } else {
                // If i >= k, Alice stops, so add dp[i] to result
                result += dp[i];
            }

            // Maintain sliding window: remove dp[i - maxPts] if window is too big
            if (i - maxPts >= 0) {
                windowSum -= dp[i - maxPts];
            }
        }

        return result;
    }
}

