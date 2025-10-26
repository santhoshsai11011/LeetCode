class Solution {
    static int countSubarrays(int [] nums,int goal){
        if(goal < 0) return 0;
        int n = nums.length;
        int l = 0;
        int r = 0;
        int count = 0;
        int sum = 0;
        while(r<n){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = countSubarrays(nums,goal) - countSubarrays(nums,goal-1);
        return ans;
    }
}