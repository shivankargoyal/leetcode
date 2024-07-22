class Solution {
    public int maxDepth(String s)
    {
        String[] arr=s.split("");
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            String ch=arr[i];
            if(ch.equals("("))
            {
                count++;
            }
            else if(ch.equals(")"))
            {
                if(max<count)
                {
                    max=count;
                }
                count--;
            }
        }
        return max;
        
    }
}