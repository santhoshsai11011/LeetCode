class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        for(int i=0;i<n;i++){
            xor1 = xor1^nums[i]^i;
        }
        xor1 = xor1^n;
        return xor1;
    }
}