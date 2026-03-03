class MinStack {
    Stack<Long> st = new Stack<>();
    long min = Integer.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)val);
            min = (long)val;
        }
        else if(val >= min) st.push((long)val);
        else{
            long newValue = (long)2*val-min;
            min = (long)val;
            st.push(newValue);
        } 
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long el = st.peek();
        if(el >= min) st.pop();
        else{
            min = 2*min-el;
            st.pop();
        } 
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long el = st.peek();
        if(el >= min) return (int)el;
        else{
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
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