class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int index = -1;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '1' && index == -1){
                index = i;
                continue;
            }
            if(ch == '1' && index != i-1) return false;
            if(ch == '1') index = i;
        }
        return true;
    }
}