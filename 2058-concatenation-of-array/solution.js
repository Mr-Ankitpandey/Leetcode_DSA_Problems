/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
    const ans = [...nums];
    let n = nums.length
    for(let i=0; i<n; i++){
        ans[i+n] = nums[i]
    }
    return ans
};
