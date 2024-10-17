class Solution {
    public double myPow(double x, int n)
    {
        return temp(x,(long)n);
    }
    public double temp(double x,long n)
    {
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 1/temp(x,-n);
        }
        if(n%2==1)
        {
            return x*temp(x*x,(n-1)/2);
        }
        else
        {
            return temp(x*x,n/2);
        }
    }
}