class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int k = 1;
        while(r<n){
            if(nums[l] != nums[r]){
                l++;
                k++;
                nums[l] = nums[r];
            }
            r++;
        }
        return k;
    }
}