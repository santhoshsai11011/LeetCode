class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [] dp = new int[m];
        for(int i=0;i<n;i++){
            int [] current = new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0) current[j] = grid[0][0];
                else{
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;
                    if(i>0) up = dp[j];
                    if(j>0) left = current[j-1];
                    current[j] = grid[i][j] + Math.min(up,left);
                }
            }
            dp = current;
        }
        return dp[m-1];
    }
}