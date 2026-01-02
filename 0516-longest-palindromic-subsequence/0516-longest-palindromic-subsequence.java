class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int [] prev = new int[n+1];
        int [] current = new int[n+1];
        String t = "";
        for(int i=n-1;i>=0;i--){
            t += s.charAt(i)+"";
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)== t.charAt(j-1)) current[j] = 1+prev[j-1];
                else current[j] = Math.max(current[j-1],prev[j]);
             }
             prev = current.clone();
        }
        return prev[n];
    }
}