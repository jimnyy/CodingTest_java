class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1;
        int row = 0, col = 0;
        int lastRow = n - 1, lastCol = n - 1;

        while (value <= n * n) {
            for (int i = col; i <= lastCol; i++)                  // right
                answer[row][i] = value++;

            for (int i = row + 1; i <= lastRow; i++)         // down
                answer[i][lastCol] = value++;

            for (int i = lastCol - 1; i >= col; i--)              // left
                answer[lastRow][i] = value++;

            for (int i = lastRow - 1; i > row; i--)              // up
                answer[i][col] = value++;

            row++;
            col++;
            lastRow--;
            lastCol--;
        }
        
        return answer;
    }
}