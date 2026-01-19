class Solution {
    static int f(int [] arr,int i,int canBuy,int [][] dp){
        if(i == arr.length) return 0;
        if(dp[i][canBuy] != -1) return dp[i][canBuy];
        if(canBuy == 1){
            int buy = -arr[i]+f(arr,i+1,0,dp);
            int skip = f(arr,i+1,1,dp);
            dp[i][canBuy] = Math.max(buy,skip);
            return dp[i][canBuy];
        }
        else{
            int sell = arr[i] + f(arr,i+1,1,dp);
            int skip = f(arr,i+1,0,dp);
            dp[i][canBuy] = Math.max(sell,skip);
            return dp[i][canBuy];

        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][] dp = new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int maxProfit = f(prices,0,1,dp);
        return maxProfit;
    }
}