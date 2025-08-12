class Solution {
    public int rob(int[] nums) {
        int rob = 0, skip = 0;
        for (int num : nums) {
            int newRob = skip + num;
            int newSkip = Math.max(skip, rob);
            rob = newRob;
            skip = newSkip;
        }
        return Math.max(rob, skip);
    }
}

