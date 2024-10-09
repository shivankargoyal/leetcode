class Solution {
    public String addStrings(String num1, String num2)
    {
        long t1=Long.parseLong(num1);
        long t2=Long.parseLong(num2);
        long sum=t1+t2;
        // System.out.println(sum);
        return Long.toString(sum);
    }
}