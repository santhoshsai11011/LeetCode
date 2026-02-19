class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String y = s+s;
        if(y.contains(goal)) return true;
        return false;
    }
}