class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = fruits.length;
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r<n){
            if(mp.containsKey(fruits[r])) mp.put(fruits[r],mp.get(fruits[r])+1);
            else mp.put(fruits[r],1);
            if(mp.size() >2){
                mp.put(fruits[l],mp.get(fruits[l])-1);
                if(mp.get(fruits[l]) == 0) mp.remove(fruits[l]);
                l++;
            }
            else{
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}