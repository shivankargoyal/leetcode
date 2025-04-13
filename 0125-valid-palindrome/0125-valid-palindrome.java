class Solution
{
    public boolean isPalindrome(String s)
    {
        String ans="";
        int j=0;
        while(j<s.length())
        {
            char ch=s.charAt(j);
            int asciiVal = (int) ch;
            if(asciiVal>=65 && asciiVal<=90)
            {
                asciiVal+=32;
                char ch2 = (char) asciiVal;
                ans=ans+ch2;
                j++;
            }
            else if(asciiVal>=97 && asciiVal<=122)
            {
                char ch2=(char)asciiVal;
                ans=ans+ch2;
                j++;
            }
            else if(asciiVal>=48 && asciiVal<=57)
            {
                char ch3=(char) asciiVal;
                ans=ans+ch3;
                j++;
            }
            else
            {
                j++;
                continue;
            }
            
        }
        String rev="";
        for(int i=0;i<ans.length();i++)
        {
            char ch=ans.charAt(i);
            rev=ch+rev;
        }
        // System.out.println(ans);
        // System.out.println(rev);
        if(rev.equals(ans))
        {
            return true;
        }
        return false;
    }
}