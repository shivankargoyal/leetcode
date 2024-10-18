class Solution {
    public String clearDigits(String s)
    {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp>=48 && temp<=57)
            {
                if(stk.peek()!=null)
                {
                    stk.pop();
                    continue;
                }
            }
            stk.push(temp);
        }
        String str="";
        while(!stk.isEmpty())
        {
            str=stk.pop()+str;
        }
        return str;
    }
}