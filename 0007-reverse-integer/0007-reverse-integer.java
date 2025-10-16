class Solution {
    public int reverse(int x) {
        long rev = 0;
        long n = Math.abs(x);
        while(n>0){
            rev = rev*10 + (n%10);
            n = n/10;
        }
        if(rev > Integer.MAX_VALUE) return 0;
        if(x<0) return -(int)rev;
        return (int)rev;
    }
}