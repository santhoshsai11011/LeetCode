class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;

        // Build prefix sum matrix
        int[][] pref = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pref[i][j] = mat[i - 1][j - 1]
                           + pref[i - 1][j]
                           + pref[i][j - 1]
                           - pref[i - 1][j - 1];
            }
        }

        // Binary search on answer (side length)
        int lo = 0, hi = Math.min(m, n);
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (existsSquare(pref, mid, threshold)) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    // Check if any square of side = len has sum <= threshold
    boolean existsSquare(int[][] pref, int len, int threshold) {
        int m = pref.length - 1;
        int n = pref[0].length - 1;

        for (int i = len; i <= m; i++) {
            for (int j = len; j <= n; j++) {
                int sum = pref[i][j]
                        - pref[i - len][j]
                        - pref[i][j - len]
                        + pref[i - len][j - len];
                if (sum <= threshold) return true;
            }
        }
        return false;
    }
}
