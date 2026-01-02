class Solution {
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
        int prev = nums1[0];
        int prev2 = 0;
        for(int i=1;i<n-1;i++){
            int pick = nums1[i] + prev2;
            int notPick = prev;
            int current = Math.max(pick,notPick);
            prev2 = prev;
            prev = current;
        }
        int ans1 = prev;

        prev = nums2[0];
        prev2 = 0;
        for(int i=1;i<n-1;i++){
            int pick = nums2[i] + prev2;
            int notPick = prev;
            int current = Math.max(pick,notPick);
            prev2 = prev;
            prev = current;
        }
        int ans2 = prev;
        return Math.max(ans1,ans2);
    }
}