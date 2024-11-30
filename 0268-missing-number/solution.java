class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arraysum = 0;
        int totalsum = (n * (n+1))/2;
        for(int i=0; i<n; i++){
            arraysum += nums[i];
        }
    return totalsum - arraysum;
    }
}
