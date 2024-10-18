class Solution {
    public String toLowerCase(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp>=65 && temp<=90)
            {
                int t=32+temp;
                temp=(char)t;
            }
            ans+=temp;
        }
        return ans;
    }
}