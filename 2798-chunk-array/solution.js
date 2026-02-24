/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    if(arr.length === 0) return []
    if(arr.length < size) return [arr];
    const chunks = [];
        for(let i=0; i<arr.length; i+=size){
           const chunkedArray = arr.slice(i, i+size)
            chunks.push(chunkedArray)
    }
    return chunks
};

