class Solution {
    public String countAndSay(int n) {
        if (n <= 0) return "";

        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prevChar = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                char currChar = result.charAt(j);
                if (currChar == prevChar) {
                    count++;
                } else {
                    sb.append(count).append(prevChar);
                    prevChar = currChar;
                    count = 1;
                }
            }
            sb.append(count).append(prevChar);
            result = sb.toString();
        }

        return result;
    }
}

