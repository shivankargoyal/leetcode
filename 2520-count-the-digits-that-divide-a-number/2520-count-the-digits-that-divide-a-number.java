class Solution
{
    public int countDigits(int num)
    {
        int n=num;
        int count=0;
        while(num!=0)
        {
            int temp=num%10;
            if(n%temp==0)
            {
                count++;
            }
            num=num/10;
        }
        return count;
    }
}