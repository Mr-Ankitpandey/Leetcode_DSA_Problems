class Solution {
    public void gameOfLife(int[][] board) {
          int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int lives = countLives(board, i, j, m, n);
                if (board[i][j] == 1 && (lives == 2 || lives == 3)) {
                    board[i][j] = 3;
                }
                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int countLives(int[][] board, int row, int col, int m, int n) {
        int lives = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == row && j == col) continue;
                if (i >= 0 && i < m && j >= 0 && j < n) {
                    lives += board[i][j] & 1;
                }
            }
        }
        return lives;
    }
}
