class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            int cost = prices[i]-min;
            if(cost>profit) profit = cost;
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}