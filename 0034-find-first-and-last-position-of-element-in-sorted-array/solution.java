class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] indx = new int[2];
        if(nums.length>0){
        for(int i=0 ;i<nums.length; i++){
            if(nums[i]==target){
                indx[0] = i;
                break;
            }else{
                indx[0] = -1;
            }
        }
        for(int j=nums.length-1 ;j>=0; j--){
            if(nums[j]==target){
                indx[1] = j;
                break;
            }else{
                indx[1] = -1;
            }
        }
        }else{
            indx[0]=-1;
            indx[1]=-1;
        }
        return indx;
    }
}
