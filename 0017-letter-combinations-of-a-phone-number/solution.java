class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        // Mapping of digits to letters
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        backtrack(digits, 0, "", map, result);
        return result;
    }

    private void backtrack(String digits, int index, String current, 
                           Map<Character, String> map, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get the possible letters for the current digit
        String letters = map.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            // Add one letter and move to the next digit
            backtrack(digits, index + 1, current + c, map, result);
        }
    }
}

