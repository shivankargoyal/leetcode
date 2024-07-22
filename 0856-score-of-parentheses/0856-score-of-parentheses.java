class Solution {
    public int scoreOfParentheses(String s)
    {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for (char ch : s.toCharArray())
        {
            if (ch == '(')
            {
                stk.push(0);
            } 
            else
            {
                int a = stk.pop();
                int b = stk.pop();
                int c = b + Math.max(2 * a, 1);
                stk.push(c);
            }
        }
        return stk.pop();
    }
}