class Solution {
    public int findGCD(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(a>nums[i]) a = nums[i];
            if(b<nums[i]) b = nums[i];
        }
        while (a>0 && b>0){
            if(a>b) a = a%b;
            else b = b%a;
        }
        if(a == 0) return b;
        else return a;
    }
}