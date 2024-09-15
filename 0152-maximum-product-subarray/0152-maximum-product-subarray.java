class Solution {
    public int maxProduct(int[] nums)
    {
        int minp=nums[0];
        int maxp=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                minp=Math.min(nums[i],minp*nums[i]);
                maxp=Math.max(nums[i],maxp*nums[i]);
            }
            else
            {
                int temp=maxp;
                maxp=Math.max(nums[i],minp*nums[i]);
                minp=Math.min(nums[i],temp*nums[i]);
            }
            System.out.println(minp+" "+maxp);
            // int temp=Math.max(minp,maxp);
            // ans=Math.max(ans,temp);
            ans=Math.max(ans,maxp);
        }
        return ans;
    }
}