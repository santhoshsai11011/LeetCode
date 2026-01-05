class Solution {
    static int f(String s1,String s2,int i,int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(s1.charAt(i) != s2.charAt(j)) return 1+f(s1,s2,i-1,j-1);
        else return Math.max(f(s1,s2,i-1,j),f(s1,s2,i,j-1));
    }
    public int findLUSlength(String a, String b) {
        int n = a.length();
        int m = b.length();
        if(a.equals(b)) return -1;
        return f(a,b,n-1,m-1);
        
    }
}