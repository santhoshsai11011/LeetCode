class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxfreq = 0;
        int maxLen = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(mp.containsKey(ch)) mp.put(ch,mp.get(ch)+1);
            else mp.put(ch,1);
            maxfreq = Math.max(maxfreq,mp.get(ch));
            int len = (r-l+1)- maxfreq;
            if(len <= k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            else{
                char ch1 = s.charAt(l);
                mp.put(ch1,mp.get(ch1)-1);
                l++;
            }
            r++;
        }
        return maxLen;
    }
}