/**
 * @param {number[]} cost
 * @return {number}
 */
var minimumCost = function(cost) {
    let minCost = 0;
    cost.sort((a,b)=>b-a)
    for(let i = 0; i<cost.length; i++){
        if ((i+1)%3===0) continue;
        minCost+=cost[i]
    }
    return minCost
};
