class Solution {
    public int maximum69Number (int num) {
        
        String s = Integer.toString(num);

        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }

        for(int i=0; i<digits.length; i++){
            if(digits[i] == 6){
                digits[i]+= 3;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        return Integer.parseInt(sb.toString());
    }
}
