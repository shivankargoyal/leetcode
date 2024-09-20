class Solution {
    public boolean canAliceWin(int[] nums)
    {
        int single=0;
        int doube=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                single+=nums[i];
            }
            else
            {
                doube+=nums[i];
            }
        }
        if(single==doube)
        {
            return false;
        }
        return true;
    }
}