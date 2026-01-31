/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    const ans = new Array(2 * n);
    for (let i = 0; i < 2 * n; i++) {
        if (i % 2 === 0) {
            ans[i] = nums[i / 2];
        } else {
            ans[i] = nums[n + Math.floor(i / 2)];
        }
    }
    return ans;
};
