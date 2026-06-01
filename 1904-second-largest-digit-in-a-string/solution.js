/**
 * @param {string} s
 * @return {number}
 */
var secondHighest = function(s) {
    const digits = s.match(/\d/g);
    const numbers = digits?.map(Number)
    let largest = -1
    let secondLargest = -1
    for(let i=0; i<numbers?.length; i++){
        if(numbers[i]>largest){
            secondLargest = largest
            largest = numbers[i]
        } 
    }
    for(let i=0; i<numbers?.length; i++){
        if(numbers[i] > secondLargest && numbers[i] !== largest){
            secondLargest = numbers[i]
        }
    }
    return secondLargest
};
