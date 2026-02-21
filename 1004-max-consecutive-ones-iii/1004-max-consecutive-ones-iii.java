class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int count = 0;
        while(r<n){
            if(nums[r] == 0) count++;
            if(count > k){
                if(nums[l] == 0) count--;
                l++;
            }
            else{
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}