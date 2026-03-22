class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        if(n<=2) return true;
        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2 == 0) even++;
            else odd++;
        }
        if(even >= 1 || odd >= 2) return true;
        return false;
    }
}