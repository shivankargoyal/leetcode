class Solution
{
    public int balancedStringSplit(String s)
    {
        int balance=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                balance++;
            }
            else
            {
                balance--;
            }
            if(balance==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            return 1;
        }
        return count;
    }
}