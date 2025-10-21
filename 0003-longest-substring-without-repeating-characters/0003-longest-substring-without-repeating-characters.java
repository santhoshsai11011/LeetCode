class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(mp.containsKey(ch)){
                if(mp.get(ch) >= l) l = mp.get(ch)+1;
            }
            int len = r-l+1;
            maxLen = Math.max(len,maxLen);
            mp.put(ch,r);
            r = r+1;
        }
        return maxLen;
    }
}