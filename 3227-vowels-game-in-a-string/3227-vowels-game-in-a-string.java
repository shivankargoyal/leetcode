class Solution {
    public boolean doesAliceWin(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char str=s.charAt(i);
            if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u')
            {
                count++;
            }
        }
        if(count==0)
        {
            return false;
        }
        else
        {
            return true;
        }
        // else
        // {
        //     return false;
        // }
    }
}