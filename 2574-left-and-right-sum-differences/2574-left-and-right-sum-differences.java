class Solution {
    public int[] leftRightDifference(int[] nums)
    {
        int[] lsum=new int[nums.length];
        int[] rsum=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            lsum[i]=count;
            // System.out.print(lsum[i]+" ");
            count+=nums[i];
        }
        // System.out.println();
        count=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            rsum[i]=count;
            // System.out.print(rsum[i]+" ");
            count+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.abs(lsum[i]-rsum[i]);
        }
        return nums;
    }
}