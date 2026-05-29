/**
 * @param {number[]} nums
 * @return {number}
 */
var minElement = function(nums) {
    const newNums = nums.map((num)=>{
        let sum = 0;
        while(num > 0){
            const digit = num % 10;
            sum+=digit
            num = Math.floor(num / 10);
        }
        return sum
    })
    return Math.min(...newNums);
};
