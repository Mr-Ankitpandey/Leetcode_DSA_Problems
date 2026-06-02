/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0
    let buyPrice = prices[0]
    let sellPrice = 0;
    for(let i=0 ; i<prices.length; i++){
        if(prices[i]<buyPrice) buyPrice = prices[i]
        else if(prices[i] - buyPrice > maxProfit){
            maxProfit = prices[i] - buyPrice
        }
    }
    return maxProfit

};
