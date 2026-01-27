class Solution {
    int f(int i,int [] nums,int [] dp){
        if(i<0) return 0;
        if(i==0) return nums[0];
        if(dp[i] != -1) return dp[i];
        int pick = nums[i]+f(i-2,nums,dp);
        int notPick = f(i-1,nums,dp);
        dp[i] = Math.max(pick,notPick);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        f(n-1,nums,dp);
        return dp[n-1];
    }
}