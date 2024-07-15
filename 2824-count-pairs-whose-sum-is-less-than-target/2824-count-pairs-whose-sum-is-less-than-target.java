class Solution
{
    public int countPairs(List<Integer> nums, int target)
    {
        int count=0;
        int i=0,j=0;
        while(i<nums.size())
        {
            j=i+1;
            while(j<nums.size())
            {
                if(target>(nums.get(i)+nums.get(j)))
                {
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}