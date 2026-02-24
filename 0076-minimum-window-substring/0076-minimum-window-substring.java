class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        int m = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int l = 0;
        int r = 0;
        int count = m;
        while(r<n){
            char ch = s.charAt(r);
            if(mp.containsKey(ch)){
                if(mp.get(ch) >0) count--;
                mp.put(ch,mp.get(ch)-1);
            }
            while(count == 0){
                if((r-l+1) < minLen){
                    minLen = r-l+1;
                    startIndex = l;
                }
                char ch2 = s.charAt(l);
                if(mp.containsKey(ch2)){
                    mp.put(ch2,mp.get(ch2)+1);
                    if(mp.get(ch2) >0) count++;
                }
                l++;
            }
            r++;
        }
        if(startIndex == -1) return "";
        return s.substring(startIndex,startIndex+minLen);
    }
}