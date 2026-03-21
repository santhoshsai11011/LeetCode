class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && (int)st.peek() > (int)ch && k>0){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        } 
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        int i=0; 
        while(i<sb.length()  && sb.charAt(i) == '0') i++;
        String ans = sb.substring(i);
        if(ans == "") return "0";
        return ans;
    }
}