class Solution {
    static int  f(int n,int [] dp,int [] nums){
        if(n<0) return 0;
        if(n==0) return nums[0];
        if(dp[n] != -1) return dp[n];
        int pick = nums[n]+f(n-2,dp,nums);
        int notPick = f(n-1,dp,nums);
        dp[n] =  Math.max(pick,notPick);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int [] nums1 = new int[n-1];
        int [] nums2 = new int[n-1];
        int [] dp = new int[n];
        for(int i=0;i<n-1;i++){
            nums1[i] = nums[i];
        }
        for(int i=1;i<n;i++){
            nums2[i-1] = nums[i]; 
        }
        Arrays.fill(dp,-1);
        int ans1 = f(n-2,dp,nums1);
        Arrays.fill(dp,-1);
        int ans2 = f(n-2,dp,nums2);
        return Math.max(ans1,ans2);
    }
}