class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int i = 0;
        int n = strs.length;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
        while(i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)) i++;
        return first.substring(0,i);
    }
}