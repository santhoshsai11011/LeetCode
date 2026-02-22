class Solution {
    static int f(int [] nums,int goal){
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        while(r<n){
            sum += nums[r];
            while(l<r && sum > goal){
                sum = sum - nums[l];
                l++;
            }
            if(sum <= goal) count += r-l+1;
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums,goal)-f(nums,goal-1);
    }
}