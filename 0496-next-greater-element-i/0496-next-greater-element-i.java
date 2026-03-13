class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums2.length;
        mp.put(nums2[n-1],-1);
        st.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]) st.pop();
            if(st.isEmpty()) mp.put(nums2[i] ,-1);
            else mp.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        int m = nums1.length;
        int [] ans = new int[m];
        for(int i=0;i<m;i++){
            ans[i] = mp.get(nums1[i]);
        }
        return ans;
    }
}