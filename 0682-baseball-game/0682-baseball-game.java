class Solution
{
    public int calPoints(String[] op)
    {
        int pre=0;
        // int double=0;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<op.length;i++)
        {
            if(op[i].equals("D"))
            {
                stk.push(2*stk.peek());
            }
            else if(op[i].equals("C"))
            {
                stk.pop();
            }
            else if(op[i].equals("+"))
            {
                int first=stk.pop();
                int second=stk.pop();
                stk.push(second);
                stk.push(first);
                stk.push((first+second));
            }
            else
            {
                int num=Integer.parseInt(op[i]);
                stk.push(num);
            }
        }
        int ans=0;
        for(int i: stk )
        {
            ans+=i;
        }
        return ans;
    }
}