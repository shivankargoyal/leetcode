class Solution {
    public int minSwaps(String s)
    {
        Stack<Character> stk=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='[')
            {
                stk.push(ch);
            }
            else
            {
                if(!stk.isEmpty() && stk.peek()=='[')
                {
                    stk.pop();
                }
                else
                {
                    stk.push(ch);
                }
            }
        }
        count=stk.size()/2;
        return (count+1)/2;
    }
}