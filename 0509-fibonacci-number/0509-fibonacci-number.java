class Solution {
    static int f(int n){
        if(n<=1) return n;
        return f(n-1)+f(n-2);
    }
    public int fib(int n) {
        int ans = f(n);
        return ans;
    }
}