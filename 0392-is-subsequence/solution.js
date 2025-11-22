/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
    const isSubsequence = (s, t) => {
        let result = false;
        if (s.length > t.length) return false;  // this is edge case
        const t_length = t.length;
        let subsequence = 0;
        for (let i = 0; i < t_length; i++) {
            if (s[subsequence] === t[i]) {
                subsequence++
            }
        }
        if(subsequence === s.length) result = true;
        return result
};
