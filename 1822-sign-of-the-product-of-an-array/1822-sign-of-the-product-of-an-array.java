class Solution
{
    public int arraySign(int[] nums)
    {
        int sum=1;
        for(int i=0;i<nums.length;i++)
        {
            // sum=sum*nums[i];
            if(sum*nums[i]>0)
            {
                sum=1;
            }
            else if(sum*nums[i]<0)
            {
                sum=-1;
            }
            else
            {
                return 0;
            }
        }
        // System.out.println(sum);
        if(sum>0)
        {
            return 1;
        }
        else if(sum<0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}