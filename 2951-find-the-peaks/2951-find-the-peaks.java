class Solution {
    public List<Integer> findPeaks(int[] mo)
    {
        List<Integer> ans=new ArrayList<>();
        if(mo.length<=2)
        {
            return ans;
        }
        int last=mo[0];
        int next=mo[2];
        for(int i=1;i<mo.length-1;i++)
        {
            last=mo[i-1];
            next=mo[i+1];
            if(mo[i]>last && mo[i]>next)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}