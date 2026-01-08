class Solution {
    static int f(int [] nums1,int [] nums2,int i,int j,int [][] dp){
        if(i <0 || j<0) return -Integer.MIN_VALUE;
        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        int take = nums1[i]*nums2[j] + Math.max(0,f(nums1,nums2,i-1,j-1,dp));
        int skip1 = f(nums1,nums2,i-1,j,dp);
        int skip2 = f(nums1,nums2,i,j-1,dp);
        dp[i][j] = Math.max(take,Math.max(skip1,skip2));
        return dp[i][j];
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        f(nums1,nums2,n-1,m-1,dp);
        return dp[n-1][m-1];
    }
}