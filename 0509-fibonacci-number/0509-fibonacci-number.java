class Solution {
    static int f(int n,int [] dp){
        if(n<=1) return n;
        dp[n] = f(n-1,dp) + f(n-2,dp);
        return dp[n];
    }
    public int fib(int n) {
        if(n<=1) return n;
        int [] dp = new int[n+1];
        f(n,dp);
        return dp[n];
    }
}