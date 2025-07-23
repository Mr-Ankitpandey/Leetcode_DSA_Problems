import java.math.BigInteger;

public class Solution {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);
        int maxLen = (int)(Math.log(num + 1) / Math.log(2));

        for (int m = maxLen; m >= 1; m--) {
            long k = (long)Math.pow(num, 1.0 / m);
            if (k <= 1) continue;
            BigInteger base = BigInteger.valueOf(k);
            BigInteger sum = BigInteger.ONE;
            BigInteger curr = BigInteger.ONE;

            for (int i = 0; i < m; i++) {
                curr = curr.multiply(base);
                sum = sum.add(curr);
            }

            if (sum.equals(BigInteger.valueOf(num))) {
                return Long.toString(k);
            }
        }

        return Long.toString(num - 1);
    }
}

