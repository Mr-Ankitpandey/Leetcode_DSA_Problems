/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    for(const character of letters){
        if(character > target) return character
        
    }
    return letters[0]
};
