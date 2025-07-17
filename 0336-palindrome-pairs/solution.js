/**
 * @param {string[]} words
 * @return {number[][]}
 */
var palindromePairs = function(words) {
    const isPalindrome = (str) => {
        let left = 0, right = str.length - 1;
        while (left < right) {
            if (str[left++] !== str[right--]) return false;
        }
        return true;
    };

    const map = new Map();
    const result = [];

    for (let i = 0; i < words.length; i++) {
        map.set(words[i], i);
    }

    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        for (let j = 0; j <= word.length; j++) {
            const prefix = word.slice(0, j);
            const suffix = word.slice(j);

            if (isPalindrome(prefix)) {
                const reversedSuffix = [...suffix].reverse().join('');
                if (map.has(reversedSuffix) && map.get(reversedSuffix) !== i) {
                    result.push([map.get(reversedSuffix), i]);
                }
            }

            if (suffix.length > 0 && isPalindrome(suffix)) {
                const reversedPrefix = [...prefix].reverse().join('');
                if (map.has(reversedPrefix) && map.get(reversedPrefix) !== i) {
                    result.push([i, map.get(reversedPrefix)]);
                }
            }
        }
    }

    return result;
};

