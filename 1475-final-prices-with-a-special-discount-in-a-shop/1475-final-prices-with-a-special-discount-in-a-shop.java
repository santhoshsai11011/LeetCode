class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n = prices.length;
        int [] arr = new int[n];
        st.push(prices[n-1]);
        arr[n-1] = prices[n-1];
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek() > prices[i]) st.pop();
            if(st.isEmpty()) arr[i] = prices[i];
            else arr[i] = prices[i] - st.peek();
            st.push(prices[i]);
        }
        return arr;
    }
}