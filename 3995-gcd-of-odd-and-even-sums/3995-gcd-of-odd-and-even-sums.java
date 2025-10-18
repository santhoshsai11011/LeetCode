class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n*n;
        int even = n*(n+1);
        while(odd>0 && even >0){
            if(odd>even) odd = odd%even;
            else even = even%odd;
        }
        if(odd == 0) return even;
        else return odd;
    }
}