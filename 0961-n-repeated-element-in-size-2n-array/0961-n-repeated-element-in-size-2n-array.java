class Solution {
    public int repeatedNTimes(int[] nums) {
        int count = 1;
        int n = nums.length;
        int x = n/2;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
                if(count == x) return nums[i];
            }
            else count = 1;
        }
        return -1;
    }
}