class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int max = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '(') counter++;
            max = Math.max(counter,max);
            if(ch == ')') counter--;
        }
        return max;
    }
}