class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int[] pos = new int[n];
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pos[i] = fruits[i][0];
            prefix[i + 1] = prefix[i] + fruits[i][1];
        }

        int maxFruits = 0;
        for (int leftSteps = 0; leftSteps <= k; leftSteps++) {
            int rightSteps = k - 2 * leftSteps;
            if (rightSteps < 0) break;
            int left = startPos - leftSteps;
            int right = startPos + rightSteps;
            int l = lowerBound(pos, left);
            int r = upperBound(pos, right);
            maxFruits = Math.max(maxFruits, prefix[r] - prefix[l]);
        }

        for (int rightSteps = 0; rightSteps <= k; rightSteps++) {
            int leftSteps = k - 2 * rightSteps;
            if (leftSteps < 0) break;
            int left = startPos - leftSteps;
            int right = startPos + rightSteps;
            int l = lowerBound(pos, left);
            int r = upperBound(pos, right);
            maxFruits = Math.max(maxFruits, prefix[r] - prefix[l]);
        }

        return maxFruits;
    }

    private int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}

