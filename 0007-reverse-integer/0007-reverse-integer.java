class Solution {
    public int reverse(int x)
    {
        // System.out.println(Integer.toString(x).length());
        int ans=0;
        while(x!=0)
        {
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            int temp=x%10;
            ans=temp+(ans*10);
            x=x/10;
        }
        
        return ans;
    }
}