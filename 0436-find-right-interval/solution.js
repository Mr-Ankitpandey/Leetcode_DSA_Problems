/**
 * @param {number[][]} intervals
 * @return {number[]}
 */
var findRightInterval = function(intervals) {
    const n = intervals.length;
    const starts = intervals.map((interval, index) => [interval[0], index]);
    starts.sort((a, b) => a[0] - b[0]);

    const result = [];

    for (let i = 0; i < n; i++) {
        const end = intervals[i][1];
        let left = 0, right = n - 1;
        let idx = -1;

        while (left <= right) {
            const mid = Math.floor((left + right) / 2);
            if (starts[mid][0] >= end) {
                idx = starts[mid][1];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        result.push(idx);
    }

    return result;
};

