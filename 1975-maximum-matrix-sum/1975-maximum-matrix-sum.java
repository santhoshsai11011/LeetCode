class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        long neg = 0;
        long sum = 0;
        long minAbs = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                long val = matrix[i][j];
                if(val<0) neg++;
                long abs = Math.abs(val);
                minAbs = Math.min(abs,minAbs);
                sum += abs;
            }
        }
        if(neg%2 == 0) return sum;
        return sum-2*minAbs;
    }
}