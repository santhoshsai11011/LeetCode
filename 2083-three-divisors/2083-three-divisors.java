class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                count++;
                if(n/i != i) count++;
            }
        }
        if(count == 3) return true;
        return false;
    }
}