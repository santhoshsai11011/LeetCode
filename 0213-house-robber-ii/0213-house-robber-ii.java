class Solution {
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
        dp[0] = nums1[0];
        for(int i=1;i<n-1;i++){
            int pick = nums1[i];
            if(i>1) pick += dp[i-2];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick,notPick);
        }
        int ans1 = dp[n-2];
        Arrays.fill(dp,-1);
        dp[0] = nums2[0];
        for(int i=1;i<n-1;i++){
            int pick = nums2[i];
            if(i>1) pick += dp[i-2];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick,notPick);
        }
        int ans2 = dp[n-2];
        int ans = Math.max(ans1,ans2);
        return ans;
    }
}