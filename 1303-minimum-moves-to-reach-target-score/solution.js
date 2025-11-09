/**
 * @param {number} target
 * @param {number} maxDoubles
 * @return {number}
 */
var minMoves = function(target, maxDoubles) {
    let minOperations = 0;
    while(target > 1 && maxDoubles > 0){
        if(target%2 == 0){
            target/= 2;
            maxDoubles--;
        }else{
            target-=1;
        }
        minOperations++;
    }
    minOperations += (target - 1);
    return minOperations;
    
};
