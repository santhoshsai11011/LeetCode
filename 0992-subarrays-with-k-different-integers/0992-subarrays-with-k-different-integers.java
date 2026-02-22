class Solution {
    static int f(int [] nums,int k){
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int l = 0;
        int r = 0;
        int count = 0;
        while(r<n){
            if(mp.containsKey(nums[r])) mp.put(nums[r],mp.get(nums[r])+1);
            else mp.put(nums[r],1);
            while(mp.size()>k){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l]) == 0) mp.remove(nums[l]);
                l++;
            }
            if(mp.size()<=k){
                count += r-l+1;
            }
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ans = f(nums,k)-f(nums,k-1);
        return ans;
    }
}