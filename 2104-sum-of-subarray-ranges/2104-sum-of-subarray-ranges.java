class Solution {
    static void nse(int [] nums,int n,int [] nse){
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]) st.pop();
            if(!st.isEmpty()) nse[i] = st.peek();
            else nse[i] = n;
            st.push(i);
        }
    }
    static void psee(int [] nums,int n,int [] psee){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]) st.pop();
            if(!st.isEmpty()) psee[i] = st.peek();
            else psee[i] = -1;
            st.push(i);
        }
    }
    static void nge(int [] nums,int n,int [] nge){
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
            if(!st.isEmpty()) nge[i] = st.peek();
            else nge[i] = n;
            st.push(i);
        }
    }
    static void pgee(int [] nums,int n,int [] pgee){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]) st.pop();
            if(!st.isEmpty()) pgee[i] = st.peek();
            else pgee[i] = -1;
            st.push(i);
        }
    }
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int [] nge = new int[n];
        int [] pgee = new int[n];
        int [] nse = new int[n];
        int [] psee = new int[n];
        nge(nums,n,nge);
        pgee(nums,n,pgee);
        nse(nums,n,nse);
        psee(nums,n,psee);
        long MinSum = 0;
        long MaxSum = 0;
        for(int i=0;i<n;i++){
            int leftMin = i-psee[i];
            int rightMin = nse[i]-i;
            MinSum += (long)nums[i]*leftMin*rightMin;

            int leftMax = i-pgee[i];
            int rightMax = nge[i]-i;
            MaxSum += (long)nums[i]*leftMax*rightMax;
        }
        return (MaxSum-MinSum);
    }
}