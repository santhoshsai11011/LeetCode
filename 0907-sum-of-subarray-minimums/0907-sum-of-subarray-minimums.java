class Solution {
    static void nse(int [] arr,int n,int [] nse){
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            if(!st.isEmpty()) nse[i] = st.peek();
            else nse[i] = n;
            st.push(i);
        }
    }

    static void psee(int [] arr,int n,int [] psee){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            if(!st.isEmpty()) psee[i] = st.peek();
            else psee[i] = -1;
            st.push(i);
        }
    }
    public int sumSubarrayMins(int[] arr) {
        int x = (int)1e9+7;
        int n = arr.length;
        int [] nse = new int[n];
        int [] psee = new int[n];
        nse(arr,n,nse);
        psee(arr,n,psee);
        long total = 0;
        for(int i=0;i<n;i++){
            int left = i-psee[i];
            int right = nse[i]-i;
            total = (total +  ((long)left*right%x*arr[i]%x))%x;
        }
        return (int)total;
    }
}