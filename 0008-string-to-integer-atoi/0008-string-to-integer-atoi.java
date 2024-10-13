class Solution {
    public int myAtoi(String s)
    {
        int count=0;
        int ans=0;
        int sign=1;
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+'))
        {
            if(s.charAt(i)=='-')
            {
                sign=(-1);
            }
            // System.out.println(sign);
            i++;
        }
        while(i<s.length() && s.charAt(i)=='0')
        {
            // System.out.println(s.charAt(i));
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int t=(s.charAt(i)-'0');
            System.out.println(t);
            if(t>=0 && t<=9)
            {
                if(ans>(Integer.MAX_VALUE-t)/10)
                {
                    return (sign==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans=(ans*10)+t;
            }
            else
            {
                break;
            }
            i++;
        }
        return (sign*ans);
    }
}