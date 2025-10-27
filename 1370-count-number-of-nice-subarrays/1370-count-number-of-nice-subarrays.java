class Solution {
    static int countSubarrays(int [] nums,int k){
        if(k<0) return 0;
        int n = nums.length;
        int count = 0;
        int sum = 0;
        int l = 0 ;
        int r = 0;
        while(r<n){
            sum += (nums[r]%2);
            while(sum > k){
                sum -= nums[l]%2;
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int count = countSubarrays(nums,k) - countSubarrays(nums,k-1);
        return count;
    }
}