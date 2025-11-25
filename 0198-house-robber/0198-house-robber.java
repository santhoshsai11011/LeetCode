class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=0) return 0;
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int pick = nums[i] + prev2;
            int notPick = prev;
            int curr = Math.max(pick,notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}