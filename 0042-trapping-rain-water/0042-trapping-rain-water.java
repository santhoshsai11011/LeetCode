class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int lMax = Integer.MIN_VALUE;
        int rMax = Integer.MIN_VALUE;
        int total = 0;
        while(l < r){
            if(height[l]  < height[r]){
                if(lMax > height[l]) total += lMax-height[l];
                else lMax = height[l];
                l++;
            }
            else{
                if(rMax > height[r]) total += rMax - height[r];
                else rMax = height[r];
                r--;
            }
        }
        return total;
    }
}