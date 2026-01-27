class Solution {
    int f(int [] a){
        int n = a.length;
        if(n==1) return a[0];
        int prev = a[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int pick = prev2 + a[i];
            int notPick = prev;
            prev2 = prev;
            prev = Math.max(pick,notPick);
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int [] nums1 = new int[n-1];
        int [] nums2 = new int[n-1];
        for(int i=0;i<n-1;i++){
            nums1[i] = nums[i];
        }
        for(int i=1;i<n;i++){
            nums2[i-1] = nums[i];
        }
        int a1 = f(nums1);
        int a2 = f(nums2);
        return Math.max(a1,a2);
    }
}