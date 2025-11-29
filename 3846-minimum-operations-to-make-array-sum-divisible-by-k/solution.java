class Solution {
    public int minOperations(int[] nums, int k) {
        
        int arrSum = 0;
        for(int i=0; i<nums.length; i++){
            arrSum+= nums[i];
        }
        return arrSum % k;
    }
}
