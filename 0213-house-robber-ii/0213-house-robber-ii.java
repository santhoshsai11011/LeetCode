class Solution {
    static int f(int n,int [] nums,int [] dp){
        if(n==0) return nums[0];
        if(n<0) return 0;
        if(dp[n] != -1) return dp[n];
        int pick = nums[n] + f(n-2,nums,dp);
        int notPick = f(n-1,nums,dp);
        dp[n] =  Math.max(pick,notPick);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int [] dp = new int[n-1];
        int [] nums1 = new int[n-1];
        int [] nums2 = new int[n-1];
        for(int i=0;i<n-1;i++){
            nums1[i] = nums[i];
        }
        for(int i=1;i<n;i++){
            nums2[i-1] = nums[i];  
        }
         Arrays.fill(dp,-1);
        int ans1 = f(n-2,nums1,dp);
         Arrays.fill(dp,-1);
        int ans2 = f(n-2,nums2,dp);
        int ans = Math.max(ans1,ans2);
        return ans;
    }
}