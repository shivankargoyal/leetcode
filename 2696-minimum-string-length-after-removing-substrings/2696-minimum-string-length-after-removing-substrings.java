class Solution {
    public int minLength(String s)
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
            if(ch=='B' && stk.peek()=='A')
            {
                stk.pop();
                continue;
            }
            if(ch=='D' && stk.peek()=='C')
            {
                stk.pop();
                continue;
            }
            else
            {
                stk.push(ch);
            }
        }
        return stk.size();
    }
}