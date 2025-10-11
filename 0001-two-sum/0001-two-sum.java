class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int [] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(mp.containsKey(x)) return new int []{i,mp.get(x)};
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}