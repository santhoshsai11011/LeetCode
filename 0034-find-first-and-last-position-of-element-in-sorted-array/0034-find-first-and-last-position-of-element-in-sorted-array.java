class Solution {
    static int first(int [] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }

    static int last(int [] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = first(nums,target);
        int last = last(nums,target);
        if(first == -1 || nums[first] != target) return new int[]{-1,-1};
        if(last == -1) return new int[]{first,nums.length-1};
        return new int[]{first,last-1};
    }
}