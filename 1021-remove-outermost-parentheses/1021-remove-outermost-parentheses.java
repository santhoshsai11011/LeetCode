class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int counter = 0;
        String ans = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == ')') st.pop();
            if(st.size() >0) ans += ch+"";
            if(ch == '(') st.push(ch);
        }
        return ans;
    }
}