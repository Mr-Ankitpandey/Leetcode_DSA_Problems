/**
 * @param {number[]} landStartTime
 * @param {number[]} landDuration
 * @param {number[]} waterStartTime
 * @param {number[]} waterDuration
 * @return {number}
 */
var earliestFinishTime = function(landStartTime, landDuration, waterStartTime, waterDuration) {
    let minTime = Infinity
    for (let i = 0; i < landStartTime.length; i++) {
        for (let j = 0; j < waterStartTime.length; j++) {

            const landFinish =
                landStartTime[i] + landDuration[i];

            const waterStart =
                Math.max(landFinish, waterStartTime[j]);

            const finish1 =
                waterStart + waterDuration[j];

            const waterFinish =
                waterStartTime[j] + waterDuration[j];

            const landStart =
                Math.max(waterFinish, landStartTime[i]);

            const finish2 =
                landStart + landDuration[i];

            minTime = Math.min(minTime, finish1, finish2);
        }
    }
    return minTime

};
