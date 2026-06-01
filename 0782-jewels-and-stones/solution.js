/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let count  = 0;
    for (letter of stones){
        for(alpha of jewels){
            if(alpha === letter) count+=1
        }

    }
    return count
};
