class Solution {

    int[][] grid;
    int m;
    int n;
    Integer[][][][] min1;
    public int minimumSum(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        min1 = new Integer[m][n][m][n];

        int min = Integer.MAX_VALUE;
        for (int i=0 ; i<m-1 ; i++) {
            if (i < m-2) {
                min = Math.min(min, min1(0, 0, i, n-1) + min2h(i+1, 0, m-1, n-1));
            }
            min = Math.min(min, min1(0, 0, i, n-1) + min2v(i+1, 0, m-1, n-1));
            min = Math.min(min, min2v(0, 0, i, n-1) + min1(i+1, 0, m-1, n-1));
        }
        for (int i=0 ; i<n-1 ; i++) {
            if (i < n-2) {
                min = Math.min(min, min1(0, 0, m-1, i) + min2v(0, i+1, m-1, n-1));
            }
            min = Math.min(min, min1(0, 0, m-1, i) + min2h(0, i+1, m-1, n-1));
            min = Math.min(min, min2h(0, 0, m-1, i) + min1(0, i+1, m-1, n-1));
        }
        return min;
    }

    int min2h(int row1, int col1, int row2, int col2) {
        int min = Integer.MAX_VALUE;
        for (int i=row1 ; i < row2 ; i++) {
            min = Math.min(min, min1(row1, col1, i, col2)+min1(i+1, col1, row2, col2));
        }   
        return min;
    }

    int min2v(int row1, int col1, int row2, int col2) {
        int min = Integer.MAX_VALUE;
        for (int i=col1 ; i < col2 ; i++) {
            min = Math.min(min, min1(row1, col1, row2, i)+min1(row1, i+1, row2, col2));
        }   
        return min;
    }

    int min1(int row1, int col1, int row2, int col2) {
        if (min1[row1][col1][row2][col2] != null) {
            return min1[row1][col1][row2][col2];
        }
        int b = row2+1;
        int t = row1-1;
        int l = col2+1;
        int r = col1-1;
        for (int i=row1 ; i<=row2 ; i++) {
            for (int j=col1 ; j<=col2 ; j++) {
                if (grid[i][j] == 1) {
                    b = Math.min(b, i);
                    t = Math.max(t, i);
                    l = Math.min(l, j);
                    r = Math.max(r, j);
                }
            }
        }

        min1[row1][col1][row2][col2] = Math.max(0, (t-b+1)) * Math.max(0, (r-l+1));
        return min1[row1][col1][row2][col2];
    }
}
