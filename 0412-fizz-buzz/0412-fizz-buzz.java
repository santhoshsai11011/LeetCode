class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        String a = "Fizz";
        String b = "Buzz";
        String c = "FizzBuzz";
        for(int i=1;i<=n;i++){
            if(i%3 ==0 && i%5==0) arr.add(c);
            else if(i%3 == 0) arr.add(a);
            else if(i%5 ==0) arr.add(b);
            else arr.add(i + "");
        }
        return arr;
    }
}