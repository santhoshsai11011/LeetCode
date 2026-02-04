class Solution {
    static void mergeSort(int [] arr,int low,int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int [] arr,int low,int mid,int high){
        int [] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left++;
                k++;
            }
            else{
                temp[k] = arr[right];
                right++;
                k++;
            }
        }
        while(left <= mid){
            temp[k] = arr[left];
            left++;
            k++;
        }
        while(right <= high){
            temp[k] = arr[right];
            right++;
            k++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }
}