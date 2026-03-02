class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] arr = new int[256];
        Arrays.fill(arr,-1);
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(r);
            if(arr[ch] >=l) l = arr[ch]+1;
            maxLen = Math.max(r-l+1,maxLen);
            arr[ch] = r;
            r++;
        }
        return maxLen;
    }
}