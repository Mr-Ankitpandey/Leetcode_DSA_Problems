class Solution {
    private static final int K = 31;
    private long[] cnt = new long[K+1];
    private long[] steps = new long[K+1];
    private long[] prefWeighted = new long[K+1];

    public Solution() {
        prefWeighted[0] = 0;
        for (int k=1;k<=K;k++){
            cnt[k] = 1L << (k-1);
            steps[k] = (k+1)/2;
            prefWeighted[k] = prefWeighted[k-1] + cnt[k]*steps[k];
        }
    }

    private long countInBlock(long L,long R,long blockL,long blockR){
        long a = Math.max(L, blockL), b = Math.min(R, blockR);
        return a<=b ? (b-a+1) : 0L;
    }

    private int bitLength(int x){
        return 32 - Integer.numberOfLeadingZeros(x);
    }

    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] q : queries) {
            int l = q[0], r = q[1];
            int kl = bitLength(l), kr = bitLength(r);
            long S = 0;
            long lowL = 1L << (kl-1), lowR = (1L<<kl)-1;
            S += countInBlock(l, r, lowL, lowR) * ((kl+1)/2);
            if (kr != kl) {
                long upL = 1L << (kr-1), upR = (1L<<kr)-1;
                S += countInBlock(l, r, upL, upR) * ((kr+1)/2);
                if (kl+1 <= kr-1) S += prefWeighted[kr-1] - prefWeighted[kl];
            }
            long dMax = (kr+1)/2;
            long ops = Math.max(dMax, (S+1)/2);
            ans += ops;
        }
        return ans;
    }
}
