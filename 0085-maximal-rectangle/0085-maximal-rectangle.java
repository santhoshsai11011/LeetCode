class Solution {
    static int largestRectangleArea(int [] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i=0;i<=n;i++){
            int currHeight = (i == n)? 0: heights[i];
            while(st.size () >0 && currHeight < heights[st.peek()]){
                int height = heights[st.pop()];
                int right = i;
                int left = (st.isEmpty())? -1:st.peek();
                int width = right - left -1;
                max = Math.max(max,height*width);
            }
            st.push(i);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea = 0;
        int [] heights = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] =='1') heights[j]++;
                else heights[j] = 0;
           }
           maxArea = Math.max(maxArea,largestRectangleArea(heights));
        }
        return maxArea;
    }
}