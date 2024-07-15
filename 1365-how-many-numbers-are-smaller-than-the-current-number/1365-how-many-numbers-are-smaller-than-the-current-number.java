class Solution
{
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        int count=0,i=0,j=0;
        int[] arr=new int[nums.length];
        while(i<nums.length)
        {
            j=0;
            while(j<nums.length)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
                j++;
            }
            arr[i]=count;
            count=0;
            i++;
        }
        return arr;
    }
}