class Solution {
    int f(int [] nums,int low,int high,int target){
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) return f(nums,low,mid-1,target);
            else return f(nums,mid+1,high,target);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ans = f(nums,0,n-1,target);
        return ans;
    }
}