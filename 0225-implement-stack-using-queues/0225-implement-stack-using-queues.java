class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        int size = q.size();
        q.add(x);
        for(int i=0;i<size;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        if(q.size() == 0) return -1;
        return q.remove();
    }
    
    public int top() {
        if(q.size() == 0) return -1;
        return q.peek();
    }
    
    public boolean empty() {
        if(q.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */