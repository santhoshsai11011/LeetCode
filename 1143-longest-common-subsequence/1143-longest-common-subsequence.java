class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [] prev = new int[m+1];
        int [] current = new int[m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)) current[j] = 1+prev[j-1];
                else current[j] = Math.max(prev[j],current[j-1]);
            }
            prev = current.clone();
        }
        return prev[m];
    }
}