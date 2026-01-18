class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] row = new int[m][n + 1];
        int[][] col = new int[m + 1][n];
        int[][] diag1 = new int[m + 1][n + 1];
        int[][] diag2 = new int[m + 1][n + 2];

        // build prefix sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
                col[i + 1][j] = col[i][j] + grid[i][j];
                diag1[i + 1][j + 1] = diag1[i][j] + grid[i][j];
                diag2[i + 1][j] = diag2[i][j + 1] + grid[i][j];
            }
        }

        for (int size = Math.min(m, n); size >= 2; size--) {
            for (int r = 0; r + size <= m; r++) {
                for (int c = 0; c + size <= n; c++) {

                    int target = row[r][c + size] - row[r][c];

                    boolean ok = true;

                    // rows
                    for (int i = r; i < r + size; i++)
                        if (row[i][c + size] - row[i][c] != target)
                            ok = false;

                    // cols
                    for (int j = c; j < c + size; j++)
                        if (col[r + size][j] - col[r][j] != target)
                            ok = false;

                    // diagonals
                    int d1 = diag1[r + size][c + size] - diag1[r][c];
                    int d2 = diag2[r + size][c] - diag2[r][c + size];

                    if (ok && d1 == target && d2 == target)
                        return size;
                }
            }
        }
        return 1;
    }
}
