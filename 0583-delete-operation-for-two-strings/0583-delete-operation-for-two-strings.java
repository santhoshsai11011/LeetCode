class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [] prev = new int[m+1];
        int [] current = new int[m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)) current[j] = 1+prev[j-1];
                else current[j] = Math.max(current[j-1],prev[j]);
            }
            prev = current.clone();
        }
        return (n+m)-2*(prev[m]);
    }
}