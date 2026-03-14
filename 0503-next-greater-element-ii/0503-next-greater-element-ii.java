class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int [] ans = new int[n];
        st.push(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            st.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            if(!st.isEmpty()) ans[i] = st.peek();
            else ans[i] = -1;
            st.push(nums[i]);
        }
        return ans;
    }
}