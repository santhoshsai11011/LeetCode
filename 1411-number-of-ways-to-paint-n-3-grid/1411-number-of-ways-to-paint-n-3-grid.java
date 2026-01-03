class Solution {
    static long MOD = 1_000_000_007;
    static long f(int row,int n,int type,long [][] dp){
        if(row == n) return 1;
        if(dp[row][type] != -1) return dp[row][type];
        long ways = 0;
        if(type == 0){
            ways += 3*f(row+1,n,0,dp)%MOD;
            ways += 2*f(row+1,n,1,dp)%MOD;
        }
        else{
            ways += 2*f(row+1,n,0,dp)%MOD;
            ways += 2*f(row+1,n,1,dp)%MOD;
        }
        dp[row][type] =  ways;
        return dp[row][type];

    }
    public int numOfWays(int n) {
        long [][] dp = new long[n][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long aba = 6*f(1,n,0,dp)%MOD;
        long abc = 6*f(1,n,1,dp)%MOD;
        return (int)((abc+aba)%(MOD));
    }
}