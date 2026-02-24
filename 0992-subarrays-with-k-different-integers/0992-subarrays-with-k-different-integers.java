class Solution {
    static int f(int [] nums,int k){
        Map<Integer,Integer> mp = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = nums.length;
        int count = 0;
        while(r<n){
            int x = nums[r];
            if(mp.containsKey(x)) mp.put(x,mp.get(x)+1);
            else mp.put(x,1);
            while(l<r && mp.size() > k){
                int y = nums[l];
                mp.put(y,mp.get(y)-1);
                if(mp.get(y) == 0) mp.remove(y);
                l++;
            }
            if(mp.size() <= k){
                count += (r-l+1);
            }
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return f(nums,k)-f(nums,k-1);
    }
}