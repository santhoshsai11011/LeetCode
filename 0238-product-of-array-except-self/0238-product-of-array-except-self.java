class Solution {
    public int[] productExceptSelf(int[] nums) {
        int div = 1;
        int count = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) count++;
            else div = div*nums[i];
        }
        int [] arr = new int[n];
        if(count >1) return arr;
        for(int i=0;i<n;i++){
            if(nums[i] != 0) arr[i] = div/nums[i];
            if(nums[i] == 0){
                for(int j=0;j<n;j++){
                    if(nums[j] == 0) arr[j] = div;
                    else arr[j] = 0;
                }
                return arr;
            }
        }
        return arr;
    }
}