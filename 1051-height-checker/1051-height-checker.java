class Solution {
    public int heightChecker(int[] hei)
    {
        int count=0;
        int[] exp=new int[hei.length];
        for(int i=0;i<hei.length;i++)
        {
            exp[i]=hei[i];
        }
        Arrays.sort(exp);
        for(int i=0;i<exp.length;i++)
        {
            if(exp[i]!=hei[i])
            {
                count++;
            }
        }
        return count;
    }
}