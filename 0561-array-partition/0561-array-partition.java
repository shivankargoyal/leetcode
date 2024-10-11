class Solution {
    public int arrayPairSum(int[] nums)
    {
        Arrays.sort(nums);
        int sum=0;
        int low=0;
        int high=1;
        while(high<=nums.length)
        {
            sum+=Math.min(nums[low],nums[high]);
            low=low+2;
            high=high+2;
        }
        return sum;
    }
}