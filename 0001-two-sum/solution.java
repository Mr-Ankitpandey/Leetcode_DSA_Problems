class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] index = new int[2];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++)
            if(nums[i] + nums[j] == target){
                index[0] = i;
                index[1] = j;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int  target = 9;
        Solution obj = new Solution();
        System.out.println(obj.twoSum(nums, target));
    }
}
