class Solution {
    static int f(int n,int [] nums,int [] dp){
        if(n<0) return 0;
        if(dp[n] != -1) return dp[n];
        int pick = f(n-2,nums,dp)+nums[n];
        int notPick = f(n-1,nums,dp)+0;
        dp[n] = Math.max(pick,notPick);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        f(n-1,nums,dp);
        return dp[n-1];
    }
}