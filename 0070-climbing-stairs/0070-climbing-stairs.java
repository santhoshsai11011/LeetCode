class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        int prev = 1;
        int prev2 = 1;
        int current = 0;
        for(int i=2;i<=n;i++){
            current = prev + prev2;
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}