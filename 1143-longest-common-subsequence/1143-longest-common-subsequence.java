class Solution {
    static int f(String s1,String s2,int i,int j,int [][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1+f(s1,s2,i-1,j-1,dp);
            return dp[i][j];
        } 
        dp[i][j] = Math.max(f(s1,s2,i,j-1,dp),f(s1,s2,i-1,j,dp));
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp = new int[n][m];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        f(text1,text2,n-1,m-1,dp);
        return dp[n-1][m-1];
    }
}