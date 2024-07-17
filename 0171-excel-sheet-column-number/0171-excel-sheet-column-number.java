class Solution
{
    public int titleToNumber(String columnTitle)
    {
        int result=0;
        String temp="";
        for(int i=0;i<columnTitle.length();i++)
        {
            temp=columnTitle.charAt(i)+temp;
        }
        for(int i=0;i<temp.length();i++)
        {
            result=result+(temp.charAt(i)-'A'+1)*((int)Math.pow(26,i));
        }
        return result;
    }
}