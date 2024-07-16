class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        Arrays.sort(nums);
        int last=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(last==nums[i])
            {
                return true;
            }
            last=nums[i];
        }
        if(last==nums[0])
        {
            return false;
        }
        return false;
    }
}