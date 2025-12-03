class Solution {
    static int f(int i,int j,List<List<Integer>> triangle,List<List<Integer>> dp){
        if(i== triangle.size()-1) return triangle.get(i).get(j);
        if(dp.get(i).get(j) != null) return dp.get(i).get(j);
        int down = f(i+1,j,triangle,dp);
        int diagonal = f(i+1,j+1,triangle,dp);
        int best = triangle.get(i).get(j) + Math.min(down,diagonal);
        dp.get(i).set(j,best);
        return dp.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        List<List<Integer>> dp = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=0;j<=i;j++){
                arr.add(null);
            }
            dp.add(arr);
        }
        int ans = f(0,0,triangle,dp);
        return ans;
    }
}