class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int maxFreq = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(mp.containsKey(ch)) mp.put(ch,mp.get(ch)+1);
            else mp.put(ch,1);
            maxFreq = Math.max(maxFreq,mp.get(ch));
            if((r-l+1)-maxFreq <= k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            else{
                char ch2 = s.charAt(l);
                mp.put(ch2,mp.get(ch2)-1);
                l++;
            }
            r++;
        }
        return maxLen;
    }
}