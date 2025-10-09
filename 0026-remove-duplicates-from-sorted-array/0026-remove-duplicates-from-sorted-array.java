class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[i] != nums[j]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return (j+1);
    }
}