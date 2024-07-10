class Solution
{
    public int minOperations(String[] logs)
    {
        int iterate=0;
        for(int i=0;i<logs.length;i++)
        {
            String ch=logs[i];
            if(ch.equals("../"))
            {
                if(iterate>=1)
                {
                    iterate--;
                }
            }
            else if(ch.equals("./"))
            {
                if(iterate!=0)
                {
                    continue;
                }
                
            }
            else
            {
                iterate++;
            }
        }
        return iterate;
    }
}