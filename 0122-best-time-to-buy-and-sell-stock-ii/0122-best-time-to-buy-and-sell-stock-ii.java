class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][] dp = new int[n+1][2];
        for(int ind=n-1;ind>=0;ind--){
            for(int canBuy = 0;canBuy <=1;canBuy++){
                if(canBuy == 1){
                    int buy = -prices[ind]+dp[ind+1][0];
                    int skip = dp[ind+1][1];
                    dp[ind][canBuy] = Math.max(buy,skip);
                }
                else{
                    int sell = prices[ind] + dp[ind+1][1];
                    int skip = dp[ind+1][0]; 
                    dp[ind][canBuy] = Math.max(sell,skip);
                }
            }
        }
        return dp[0][1];
    }
}