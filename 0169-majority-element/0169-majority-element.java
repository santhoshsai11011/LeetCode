class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el = nums[0];
        int count = 0;
        for(int i=0;i<n;i++){
            if(count == 0) el = nums[i];
            if(nums[i] == el) count++;
            else count--;
        }
        count++;
        for(int i=0;i<n;i++){
            if(nums[i] == el) count++;
        }
        if(count > n/2) return el;
        return -1;
    }
}