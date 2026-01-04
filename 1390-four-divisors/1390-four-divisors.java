class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int sum = 0;
            int count = 0;
            for(int j=1;j*j<=x;j++){
                if(x%j == 0){
                    count++;
                    sum += j;
                    if(x/j != j){
                        sum += x/j;
                        count++;
                    } 
                } 
            }
            if(count == 4) ans += sum;
        }
        return ans;
    }
}