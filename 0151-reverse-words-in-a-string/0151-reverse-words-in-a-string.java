class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String word = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == ' ' && word.length() >0){
                st.add(word);
                word = "";
            } 
            else if(ch != ' ') word += ch+"";
        }
        if(word.length() >0) st.add(word);
        word = "";
        while(st.size()>0){
            word += st.pop() + " ";
        }
        return word.trim();
    }
}