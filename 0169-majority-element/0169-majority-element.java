class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])) mp.put(nums[i],mp.get(nums[i])+1);
            else mp.put(nums[i],1);
        }
        for(var el : mp.keySet()){
            if(mp.get(el) > n/2) return el;
         }
         return -1;
    }
}