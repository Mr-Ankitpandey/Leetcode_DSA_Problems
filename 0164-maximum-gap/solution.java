class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;

        if(n<2) return 0;

        Arrays.sort(nums);
        int i, j,  maxGap = 0;
        for(i=0,j=1; i<n-1 && j<n; i++, j++){
            int gap = nums[j] - nums[i];
            if(gap > maxGap){
                maxGap = gap;
            }
        }
        return maxGap;
    }
}
