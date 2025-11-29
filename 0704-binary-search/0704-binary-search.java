class Solution {
    static int bSearch(int low,int high,int [] nums,int target){
        if(low> high) return -1;
        int mid = (low+high)/2;
        if(nums[mid] == target) return mid;
        else if (nums[mid] > target) return bSearch(low,mid-1,nums,target);
        else return bSearch(mid+1,high,nums,target);
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ans = bSearch(0,n-1,nums,target);
        return ans;
    }
}