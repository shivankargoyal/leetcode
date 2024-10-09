class Solution {
    public int singleNumber(int[] nums) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            // System.out.println("1st loop, i="+i);
            
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
            {continue;}
            else{
                // System.out.println("2nd loop, j="+j);
                if(nums[i]*2 == nums[i]+nums[j])
                {
                    // System.out.println("was in if");
                    count=0;
                    break;
                }
                else
                {
                    // System.out.println("was in else");
                    count++;
                    continue;
                }
            }
            }
            if(count!=0)
            {
                return nums[i];
            }
            else
            {
                continue;
            }
        }
        return nums[0];
        
    }
}