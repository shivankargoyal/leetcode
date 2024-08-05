class Solution {
    public int longestConsecutive(int[] nums)
    {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int maxi=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                System.out.println("in first if");
                continue;
            }
            if(nums[i]-nums[i+1]==(-1))
            {
                System.out.println("in second if");
                count++;
            }
            else
            {
                System.out.println("in else");
                maxi=Math.max(maxi,count);
                count=1;
            }
        }
        maxi=Math.max(maxi,count);
        return maxi;
    }
}