class Solution {
    public String makeGood(String s)
    {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(stk.isEmpty())
            {
                stk.push(ch);
                continue;
            }
            char temp=stk.peek();
            if(ch==((int)temp+32) || ch==((int)temp-32))
            {
                stk.pop();
            }
            else
            {
                stk.push(ch);
            }
        }
        String result="";
        while(!stk.isEmpty())
        {
            result=stk.pop()+result;
        }
        return result;
    }
}