class Pair{
    int value;
    int min;
    Pair(int value,int min){
        this.value = value;
        this.min = min;
    }
}
class MinStack {
    Stack<Pair> st = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()) st.push(new Pair(val,val));
        else st.push(new Pair(val,Math.min(val,st.peek().min)));
    }
    
    public void pop() {
         st.pop();
    }
    
    public int top() {
        return st.peek().value;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */