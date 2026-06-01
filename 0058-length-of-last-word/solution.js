/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    const normalized = s.replace(/\s+/g, " ").trim();
     let length = 0;

    for (let i = normalized.length - 1; i >= 0; i--) {
        if (normalized[i] === " ") break;
        length++;
    }

    return length;
};
