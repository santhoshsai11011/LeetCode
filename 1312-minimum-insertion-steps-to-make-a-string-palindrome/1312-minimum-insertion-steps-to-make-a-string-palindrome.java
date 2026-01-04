class Solution {
    static int f(String s1,String s2,int i,int j,int [][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1+f(s1,s2,i-1,j-1,dp);
            return dp[i][j];
        }
        dp[i][j] = Math.max(f(s1,s2,i-1,j,dp),f(s1,s2,i,j-1,dp));
        return dp[i][j];
    }
    public int minInsertions(String s) {
        int n = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int [][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int lcs = f(s,t,n-1,n-1,dp);
        int ans = n-lcs;
        return ans;
    }
}