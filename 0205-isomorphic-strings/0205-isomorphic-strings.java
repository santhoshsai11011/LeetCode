class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] p = new int[256];
        int [] q = new int[256];
        int n = s.length();
        for(int i=0;i<n;i++){
            if(p[s.charAt(i)] != q[t.charAt(i)]) return false;
            p[s.charAt(i)] = i+1;
            q[t.charAt(i)] = i+1;
        }
        return true;
    }
}