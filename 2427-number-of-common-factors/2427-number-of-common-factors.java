class Solution {
    public int commonFactors(int a, int b)
    {
        int mid=Math.min(a,b);
        int count=0;
        for(int i=1;i<=mid;i++)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
                count++;
            }
            // System.out.println(i);
        }
        return count;
    }
}