class Solution {
    public int sumFourDivisors(int[] nums) {
        int ansSum = 0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int count = 0;
            int sum = 0;
            for(int j=1;j*j<=n;j++){
                if(n%j == 0){
                    sum += j;
                    count++;
                    if(n/j != j){
                        count++;
                        sum += n/j;
                    } 
                }
            }
            if(count == 4) ansSum += sum;
        }
        return ansSum;
    }
}