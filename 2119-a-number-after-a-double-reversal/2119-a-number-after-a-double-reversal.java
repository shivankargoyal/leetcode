class Solution
{
    public boolean isSameAfterReversals(int num)
    {
        int len=String.valueOf(num).length();
        if(len>1)
        {
            if(num%10==0)
            {
                return false;
            }
        }
        return true;
    }
}