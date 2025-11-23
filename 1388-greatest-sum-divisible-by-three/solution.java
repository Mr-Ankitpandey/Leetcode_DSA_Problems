import java.util.Arrays;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int arrSum = 0;
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            arrSum += nums[i];
        }

        if (arrSum % 3 == 0) {
            return arrSum;
        }

        Arrays.sort(nums);

        int mod = arrSum % 3;

        int singleRemoval = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == mod) {
                singleRemoval = nums[i];
                break;
            }
        }

        int neededRem = (mod == 1) ? 2 : 1;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == neededRem) {
                if (nums[i] < first) {
                    second = first;
                    first = nums[i];
                } else if (nums[i] < second) {
                    second = nums[i];
                }
            }
        }

        int pairRemoval = (first != Integer.MAX_VALUE && second != Integer.MAX_VALUE) ? first + second
                : Integer.MAX_VALUE;

        int candidate1 = (singleRemoval == Integer.MAX_VALUE) ? 0 : arrSum - singleRemoval;
        int candidate2 = (pairRemoval == Integer.MAX_VALUE) ? 0 : arrSum - pairRemoval;

        return Math.max(candidate1, candidate2);
    }
}

