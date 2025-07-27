class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = new int[combined.length()];
        for (int i = 1; i < combined.length(); i++) {
            int len = lps[i - 1];
            while (len > 0 && combined.charAt(i) != combined.charAt(len)) {
                len = lps[len - 1];
            }
            if (combined.charAt(i) == combined.charAt(len)) {
                len++;
            }
            lps[i] = len;
        }

        int toAdd = s.length() - lps[combined.length() - 1];
        String addOn = new StringBuilder(s.substring(lps[combined.length() - 1])).reverse().toString();
        return addOn + s;
    }
}

