class Solution {
    public String removeOuterParentheses(String s)
    {
        String res="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                if(count>0)
                {
                    res+=ch;
                }
                count++;
            }
            else if(ch==')')
            {
                count--;
                if(count>0)
                {
                    res+=ch;
                }
            }
        }
        return res;
        
    }
}