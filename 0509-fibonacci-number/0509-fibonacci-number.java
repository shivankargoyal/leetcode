class Solution {
    public int fib(int n)
    {
        int first=0;
        int second=1;
        if(n<=1)
        {
            return first;
        }
        int sum=0;
        for(int i=1;i<n;i++)
        {
            sum=first+second;
            int temp=second;
            second=first+second;
            first=temp;
        }
        return sum;
    }
}