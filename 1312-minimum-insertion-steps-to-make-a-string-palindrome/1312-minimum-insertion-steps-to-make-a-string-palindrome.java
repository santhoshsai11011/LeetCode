class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int [] prev = new int[n+1];
        int [] current = new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1) == t.charAt(j-1)) current[j] = 1+prev[j-1];
                else current[j] = Math.max(current[j-1],prev[j]);
            }
            prev = current.clone();
       }
       return n-prev[n];
    }
}