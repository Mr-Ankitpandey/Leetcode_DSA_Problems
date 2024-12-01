class Solution {
    public int findPeakElement(int[] nums) {
        int peak=nums[0];
        int indx=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>peak){
                peak=nums[i];
                indx=i;
            }
        }
        
        return indx;
    }
}
