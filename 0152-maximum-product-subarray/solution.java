class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = max;

        for (int i = 1; i < nums.length; i++) {
            int prevMin = min;
            int prevMax = max;

            min = Math.min(nums[i], Math.min(nums[i] * prevMin, nums[i] * prevMax));
            max = Math.max(nums[i], Math.max(nums[i] * prevMin, nums[i] * prevMax));

            res = Math.max(res, max);
        }

        return res;
    }
}

