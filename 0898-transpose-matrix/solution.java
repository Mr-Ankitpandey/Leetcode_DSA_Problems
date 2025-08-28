class Solution {
    public int[][] transpose(int[][] matrix) {
       int row = matrix.length, col = matrix[0].length;
       int[][] transpose = new int[col][row];

       for(int i=0; i<transpose.length; i++){
        for(int j=0; j<transpose[0].length; j++){
            transpose[i][j] = matrix[j][i];
        }
       }
       return transpose; 
    }
}
