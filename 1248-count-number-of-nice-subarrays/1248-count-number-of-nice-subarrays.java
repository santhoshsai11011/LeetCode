class Solution {
    static int f(int [] nums,int k){
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        while(r<n){
            if(nums[r]%2 == 1) sum++;
            while(sum > k){
                if(nums[l]%2 == 1) sum--;
                l++;
            }
            if(sum <=k){
                count = count + (r-l+1);
            }
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return f(nums,k)-f(nums,k-1);
    }
}