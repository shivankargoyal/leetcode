class Solution
{
    public int scoreOfString(String s)
    {
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int temp=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            count+=temp;
        }
        return count;
    }
}