class Solution {
    static int binarySearch(int [] arr,int low,int high,int target){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) return binarySearch(arr,low,mid-1,target);
            return binarySearch(arr,mid+1,high,target);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ans = binarySearch(nums,0,n-1,target);
        return ans;
    }
}