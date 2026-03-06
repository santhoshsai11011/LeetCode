class Solution {
    public int countOdds(int low, int high) {
        int count = (high-low)/2;
        if(low%2 == 1 || high%2 == 1) return count+1;
        return count;
    }
}