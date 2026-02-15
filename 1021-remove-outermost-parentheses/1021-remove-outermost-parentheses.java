class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == ')') counter--;
            if(counter != 0) ans.append(ch);
            if(ch == '(') counter++;
        }
        return ans.toString();
    }
}