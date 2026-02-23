class Solution {
    public int numberOfSubstrings(String s) {
        int [] arr = new int[3];
        Arrays.fill(arr,-1);
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            arr[ch-'a'] = i;
            count += Math.min(arr[0],Math.min(arr[1],arr[2]))+1;
        }
        return count;
    }
}