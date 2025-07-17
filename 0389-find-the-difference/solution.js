/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
    let charCodeSum = 0;
    for (let i = 0; i < t.length; i++) {
        charCodeSum += t.charCodeAt(i);
    }
    for (let i = 0; i < s.length; i++) {
        charCodeSum -= s.charCodeAt(i);
    }
    return String.fromCharCode(charCodeSum);
};

