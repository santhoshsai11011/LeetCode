class Solution {
    public int subtractProductAndSum(int n) {
        long product = 1;
        long sum = 0;
        int x = n;
        while(x>0){
            product = product*(x%10);
            sum = sum+(x%10);
            x = x/10;
        }
        return (int)(product-sum);
    }
}