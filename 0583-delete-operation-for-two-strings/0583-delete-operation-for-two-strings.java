class Solution {
    static int f(String s1,String s2,int i,int j,int [][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = f(s1,s2,i-1,j-1,dp);
        else{
            return dp[i][j] = Math.min(1+f(s1,s2,i-1,j,dp),1+f(s1,s2,i,j-1,dp));
        }
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = f(word1,word2,n-1,m-1,dp);
        return dp[n-1][m-1];
    }
}