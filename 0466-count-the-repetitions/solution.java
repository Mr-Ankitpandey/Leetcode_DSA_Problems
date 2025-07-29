class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        if (n1 == 0) return 0;

        int[] indexr = new int[s2.length() + 1];
        int[] countr = new int[s2.length() + 1];
        int index = 0, count = 0;

        for (int i = 1; i <= n1; i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(index)) {
                    index++;
                    if (index == s2.length()) {
                        index = 0;
                        count++;
                    }
                }
            }

            countr[i] = count;
            indexr[i] = index;

            for (int k = 0; k < i; k++) {
                if (indexr[k] == index) {
                    int preCount = countr[k];
                    int patternCount = ((n1 - k) / (i - k)) * (countr[i] - countr[k]);
                    int remain = countr[k + (n1 - k) % (i - k)] - countr[k];
                    return (preCount + patternCount + remain) / n2;
                }
            }
        }

        return countr[n1] / n2;
    }
}

