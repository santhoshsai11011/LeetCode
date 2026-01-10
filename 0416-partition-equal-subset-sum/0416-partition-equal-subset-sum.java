import java.util.*;
class Solution {
    Boolean f(int [] arr,int i,int target,Boolean [][] dp){
        if(target == 0) return true;
        if(i==0) return (arr[i] == target);
        if(dp[i][target] != null) return dp[i][target];
        boolean notPick = f(arr,i-1,target,dp);
        boolean pick = false;
        if(arr[i] <= target) pick = f(arr,i-1,target-arr[i],dp);
        dp[i][target] = pick || notPick;
        return dp[i][target]; 
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2 != 0) return false;
        int target = sum/2;
        Boolean [][] dp = new Boolean[n][target+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],null);
        }
        Boolean ans = f(nums,n-1,target,dp);
        return ans;
    }
}