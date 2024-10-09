class Solution
{
    public int[] constructRectangle(int area)
    {
        int sq=(int) Math.sqrt(area);
        int []ans=new int[2];
        for(int i=sq;i>0;i--)
        {
            if(area%i==0)
            {
                ans[1]=i;
                ans[0]=area/i;
                break;
            }
        }
        return ans;
    }
}