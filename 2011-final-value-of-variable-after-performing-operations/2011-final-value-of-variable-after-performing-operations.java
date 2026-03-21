class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        int n = operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].equals("--X")) ans -= 1;
            else if(operations[i].equals("X--")) ans -= 1;
            else if(operations[i].equals("X++")) ans += 1;
            else if(operations[i].equals("++X")) ans += 1;
        }
        return ans;
    }
}