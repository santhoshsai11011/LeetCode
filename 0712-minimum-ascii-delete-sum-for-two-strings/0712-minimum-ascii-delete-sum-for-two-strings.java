class Solution {
    static int f(String s1,String s2,int i,int j,int [][] dp){
        if(i <0 && j<0) return 0;
        if(i<0) return (int)s2.charAt(j)+f(s1,s2,i,j-1,dp);
        if(j<0) return (int)s1.charAt(i)+f(s1,s2,i-1,j,dp);
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) dp[i][j] = f(s1,s2,i-1,j-1,dp);
        else dp[i][j] = Math.min((int)s2.charAt(j)+f(s1,s2,i,j-1,dp),(int)s1.charAt(i)+f(s1,s2,i-1,j,dp));
        return dp[i][j];
    }
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int [][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        f(s1,s2,n-1,m-1,dp);
        return dp[n-1][m-1];
    }
}