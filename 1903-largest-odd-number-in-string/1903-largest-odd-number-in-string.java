class Solution
{
    public String largestOddNumber(String num)
    {
        String ans="";
        for(int i=num.length()-1;i>=0;i--)
        {
            char ch=num.charAt(i);
            int temp=(int)(ch -'0');
            // System.out.println(temp);
            if(temp%2==1)
            {
                if(i==num.length()-1)
                {
                    return num;
                }
                ans+=Character.forDigit(temp,10);
            }
        }
        return ans;
    }
}