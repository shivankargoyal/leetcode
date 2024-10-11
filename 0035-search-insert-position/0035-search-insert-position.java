class Solution {
    public int searchInsert(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int avg=(low+high)/2;
            if(nums[avg]==target)
            {
                return avg;
            }
            else if(nums[avg]<target)
            {
                low=avg+1;
            }
            else
            {
                high=avg-1;
            }
        }
        return low;
    }
}