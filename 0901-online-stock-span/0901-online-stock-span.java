class Pair{
    int val;
    int ind;
    Pair(int val,int ind){
        this.val = val;
        this.ind = ind;
    }
}

class StockSpanner {
    Stack<Pair> st = new Stack<>();
    int counter = -1;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        counter++;
        int ans = counter+1;
        while(!st.isEmpty() && st.peek().val <= price) st.pop();
        if(!st.isEmpty()) ans = counter-st.peek().ind;
        st.push(new Pair(price,counter));
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */