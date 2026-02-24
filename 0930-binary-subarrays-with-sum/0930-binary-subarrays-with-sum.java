class Solution {
    static int f(int [] nums,int k){
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        int n = nums.length;
        while(r<n){
            if(nums[r] == 1) sum += 1;
            while(l<r && sum >k){
                if(nums[l] == 1) sum--;
                l++;
            }
            if(sum <= k) count += r-l+1;
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums,goal)-f(nums,goal-1);

    }
}