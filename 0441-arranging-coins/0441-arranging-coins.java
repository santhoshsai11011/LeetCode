class Solution {
    public int arrangeCoins(int n) {
        if(n == 1) return 1;
        long low = 1;
        long high = n;
        long ans = -1;
        while(low <= high){
            long mid = (low+high)/2;
            long coinCount = mid*(mid+1)/2;
            if(coinCount <= n){
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return (int)ans;
    }
}