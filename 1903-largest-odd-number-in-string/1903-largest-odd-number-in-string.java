class Solution
{
    public String largestOddNumber(String num)
    {
        if(num.length()==0)
        {
            return "";
        }
        int temp=num.charAt(num.length()-1);
        if(temp%2==1)
        {
            return num;
        }
        return largestOddNumber(num.substring(0,num.length()-1));
    }
}