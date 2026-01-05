class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [] prev = new int[m+1];
        int [] current = new int[m+1];

        for(int j=1;j<=m;j++) prev[j] = j;

        for(int i=1;i<=n;i++){
            current[0] = i;
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)) current[j] = prev[j-1];
                else current[j]= 1+Math.min(prev[j-1],Math.min(prev[j],current[j-1]));
            }
            prev = current.clone();
        }
        return prev[m];
    }
}