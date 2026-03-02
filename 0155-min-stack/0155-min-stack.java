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
            long newVal = (long)2*val-min;
            min = val;
            st.push(newVal);
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long top = st.pop();
        if(top < min){
            long newVal = 2*min-(long)top;
            min = newVal;
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long top = st.peek();
        if(top >= min) return (int)top;
        else return (int)min;
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