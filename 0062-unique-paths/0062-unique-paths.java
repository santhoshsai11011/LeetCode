class Solution {
    public int uniquePaths(int m, int n) {
        int [] dp = new int[n];
        dp[0] = 1;
        for(int i=0;i<m;i++){
            int [] temp = new int[n];
            for(int j=0;j<n;j++){
                int current = 0;
                if(j>0) current = temp[j-1];
                temp[j] = dp[j] + current;
            }
            dp = temp;
        }
        return dp[n-1];
    }
}