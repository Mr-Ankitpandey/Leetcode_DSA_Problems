/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    
    let keys = Object.keys(obj).length;
    if(keys === 0) return true
    return false
};
