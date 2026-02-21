class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int [] arr = new int[256];
        Arrays.fill(arr,-1);
        int l = 0;
        int r = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(arr[ch] >= l) l = arr[ch] +1;
            arr[ch] = r;
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}