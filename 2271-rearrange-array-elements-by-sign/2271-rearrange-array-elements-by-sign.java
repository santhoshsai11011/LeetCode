class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x = nums.length;
        int positives [] = new int[x/2];
        int negatives [] = new int[x/2];
        int p = 0;
        int n = 0;
        for(int i=0;i<x;i++){
            if(nums[i] >0){
                positives[p] = nums[i];
                p++;
            }
            else{
                negatives[n] = nums[i];
                n++;
            }
        }
        for(int i=0;i<x/2;i++){
            nums[2*i] = positives[i];
            nums[2*i+1] = negatives[i];
        }
        return nums;
    }
}