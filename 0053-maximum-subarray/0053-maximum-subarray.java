class Solution {
    public int maxSubArray(int[] nums)
    {
        int ans=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(curr<0)
            {
                curr=0;
            }
            curr+=nums[i];
            if(curr>ans)
            {
                ans=curr;
            }
        }
        return ans;
    }
}