class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length();
        String maxGood = "";

        for(int i=0; i<=len - 3; i++){
            String sub = num.substring(i, 3+i);

            if(sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)){
                if(maxGood.equals("") || sub.compareTo(maxGood) > 0){
                    maxGood = sub;
                }
            }
        }
        return maxGood;
    }
}
