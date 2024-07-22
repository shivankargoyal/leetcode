class Solution {
    public int[] maxDepthAfterSplit(String seq)
    {
        int[] result=new int[seq.length()];
        int depth=0;
        for(int i=0;i<seq.length();i++)
        {
            if(seq.charAt(i)=='(')
            {
                depth++;
                result[i]=depth%2;
            }
            else
            {
                result[i]=depth%2;
                depth--;
            }
        }
        return result;
    }
}