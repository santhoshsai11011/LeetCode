class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n-1;
        String str = s.toLowerCase();
        while(l<=r){
            while(l<r && !Character.isLetterOrDigit(str.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(str.charAt(r))) r--;
            if(str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}