class Solution {
    static void mergeSort(int [] arr,int low,int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int [] arr,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int k = 0;
        int [] x = new int[high-low+1];
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                x[k] = arr[i];
                i++;
                k++;
            }
            else{
                x[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            x[k] = arr[i];
            i++;
            k++;
        }
        while(j<=high){
            x[k] = arr[j];
            j++;
            k++;
        }

        for(int p=low;p<=high;p++){
            arr[p] = x[p-low];
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }
}