class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        boolean flag = true;
        int x = n;
        int rev = 0;
        while(x>0){
            rev = rev*10 + x%10;
            x = x/10;
        }

        while(rev>0){
            if(flag == true) sum += rev%10;
            else sum -= rev%10;
            flag = !flag;
            rev = rev/10;
        }
        return sum;
    }
}